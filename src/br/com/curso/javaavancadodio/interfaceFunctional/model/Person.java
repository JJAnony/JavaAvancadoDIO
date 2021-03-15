package br.com.curso.javaavancadodio.interfaceFunctional.model;

public class Person {
    private String name;
    private Integer age;

    public Person() {
        this.name = "Jhon";
        this.age = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("{name:'%s', age:%d}", this.name, this.age);
    }
}
