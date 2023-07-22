package com.example.singleton;

/**
 * 静态内部类(线程安全)
 * <p>
 * 静态内部类方式在 Singleton07 类被装载时并不会立即实例化,
 * 而是在需要实例化时, 调用 getInstance 方法, 才会装载 SingletonInstance 类, 从而完成 Singleton07 的实例化
 *
 * @author Yu
 */
public class Singleton07 {
    private static volatile Singleton07 instance;

    private Singleton07() {
    }

    /**
     * 静态内部类, 该类中有一个静态属性
     */
    private static class SingletonInstance {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    /**
     * 提供一个静态的公有方法, 直接返回 SingletonInstance.INSTANCE
     */
    public static synchronized Singleton07 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
