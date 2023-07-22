package com.example.singleton;

/**
 * 懒汉式(线程安全)
 * 双重检查
 *
 * @author Yu
 */
public class Singleton06 {
    /**
     * volatile 可见性
     */
    private static volatile Singleton06 instance;

    private Singleton06() {
    }

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
     */
    public static Singleton06 getInstance() {
        if (instance == null) {
            synchronized (Singleton06.class) {
                if (instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}