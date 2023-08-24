package com.example.bridge;

/**
 * @author Yu
 */
public abstract class AbstractPhone {

    private Brand brand;

    public AbstractPhone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }
}
