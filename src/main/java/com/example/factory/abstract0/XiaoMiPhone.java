package com.example.factory.abstract0;

/**
 * 小米手机
 *
 * @author Yu
 */
public class XiaoMiPhone implements Phone {

    @Override
    public void call() {
        System.out.println("Xiaomi phone making a call.");
    }
}
