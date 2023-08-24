package com.example.bridge;

/**
 * 折叠式手机类
 *
 * @author Yu
 */
public class FoldedPhone extends AbstractPhone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(" FoldedPhone ");
    }

    @Override
    public void close() {
        super.close();
        System.out.println(" FoldedPhone ");
    }

    @Override
    public void call() {
        super.call();
        System.out.println(" FoldedPhone ");
    }
}
