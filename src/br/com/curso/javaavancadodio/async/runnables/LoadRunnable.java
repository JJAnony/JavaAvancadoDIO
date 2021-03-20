package br.com.curso.javaavancadodio.async.runnables;

public class LoadRunnable implements Runnable {

    private Thread thread;

    public LoadRunnable(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(500);
                if (!this.thread.isAlive()) {
                    break;
                }
                System.out.println("Loading...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
