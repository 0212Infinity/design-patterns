package com.example.singleton;

/**
 * 饿汉式(线程安全, 静态代码块)
 *
 * @author Yu
 */
public class Singleton02 {
    /**
     * 构造器私有化
     */
    private Singleton02() {
    }

    /**
     * 本类内部创建对象实例
     */
    private static Singleton02 instance;


    static {
        // 在静态代码块中，创建单例对象
        instance = new Singleton02();
    }

    /**
     * 提供一个公有的静态方法，返回实例对象
     */
    public static Singleton02 getInstance() {
        return instance;
    }
}
