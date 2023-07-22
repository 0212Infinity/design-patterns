package com.example.factory.abstract0;

/**
 * 华为手机
 *
 * @author Yu
 */
public class HuaWeiPhone implements Phone {

    @Override
    public void call() {
        System.out.println("Huawei phone making a call.");
    }
}
