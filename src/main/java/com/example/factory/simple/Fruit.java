package com.example.factory.simple;

/**
 * 水果类
 *
 * @author Yu
 */
public class Fruit {

    private final String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
