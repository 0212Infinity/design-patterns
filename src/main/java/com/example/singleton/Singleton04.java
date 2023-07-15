package com.example.singleton;

/**
 * 懒汉式(线程安全, 同步方法)
 *
 * @author Yu
 */
public class Singleton04 {
    private static Singleton04 instance;

    private Singleton04() {
    }

    /**
     * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
     */
    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }
}