package com.example.singleton;


/**
 * 懒汉式(线程不安全)
 *
 * @author Yu
 */
public class Singleton03 {
    private static Singleton03 instance;

    private Singleton03() {
    }

    /**
     * 提供一个静态的公有方法, 当使用到该方法时, 才去创建 instance
     */
    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
