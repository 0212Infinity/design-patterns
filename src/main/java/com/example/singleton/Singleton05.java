package com.example.singleton;

/**
 * 懒汉式(线程不安全, 同步代码块)
 * 不使用 ✖
 *
 * @author Yu
 */
public class Singleton05 {
    private static Singleton05 instance;

    private Singleton05() {
    }

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
