package com.example.singleton;

/**
 * 饿汉式(线程安全, 静态常量)
 *
 * @author Yu
 */
public class Singleton01 {
    /**
     * 构造器私有化
     */
    private Singleton01() {
    }

    /**
     * 本类内部创建对象实例
     */
    private final static Singleton01 INSTANCE = new Singleton01();

    /**
     * 提供一个公有的静态方法，返回实例对象
     */
    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
