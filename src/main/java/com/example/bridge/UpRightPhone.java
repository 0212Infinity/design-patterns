package com.example.bridge;

/**
 * 直立样式手机类
 *
 * @author Yu
 */
public class UpRightPhone extends AbstractPhone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(" UpRightPhone ");
    }

    @Override
    public void close() {
        super.close();
        System.out.println(" UpRightPhone ");
    }

    @Override
    public void call() {
        super.call();
        System.out.println(" UpRightPhone ");
    }
}
