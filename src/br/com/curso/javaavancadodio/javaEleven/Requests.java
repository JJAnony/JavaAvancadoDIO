package br.com.curso.javaavancadodio.javaEleven;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Java 11
 */
public class Requests {

    static ExecutorService service = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            var thread = new Thread(r);
            var daemon = thread.isDaemon() ? "Daemon" : "Not Daemon";
            System.out.println(String.format("Nova Thread :: %s Group:: %s", daemon, thread.getThreadGroup()));
            return thread;
        }
    });

    /**
     * Utilizando HttpClient e HttpRequest
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        connectAkamaiHttp11Client();
    }

    /**
     * Conexão Http 2 com Threads de Requisições
     */
    private static void connectAkamaiHttp11Client() {
        try {
            var client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();

            var startTime = System.currentTimeMillis();

            var request = HttpRequest.newBuilder().GET()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(String.format("Status code :: %s", response.statusCode()));

            List<Future<?>> futures = new ArrayList<>();

            response.body().lines().filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("/>")))
                    .forEach(image -> {
                        Future<?> imageFuture = service.submit(() -> {
                            try {
                                var imageRequest = HttpRequest.newBuilder().GET()
                                        .uri(URI.create("https://http2.akamai.com" + image))
                                        .build();
                                var imageResponse = client.send(imageRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println(String.format("Image :: %s, Status code :: %s", image, imageResponse.statusCode()));
                            } catch (IOException | InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        });
                        futures.add(imageFuture);
                    });

            futures.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException ex) {
                    ex.printStackTrace();
                }
            });

            var finalTime = System.currentTimeMillis();

            System.out.println("Tempo de Carregamento :: " + (finalTime - startTime) + "ms");

        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            service.shutdown();
        }
    }

    /**
     * Conecta e Printa o conteudo da url do Java 10
     */
    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();
        var client = HttpClient.newHttpClient();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(String.format("Status code :: %s", response.statusCode()));
        System.out.println(String.format("Headers Response :: %s", response.headers()));
        System.out.println(response.body());

    }
}
