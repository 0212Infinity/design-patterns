package com.example.singleton;

/**
 * 枚举(线程安全)
 * <p>
 * 不仅能避免多线程同步问题, 而且还能防止反序列化重新创建新的对象
 *
 * @author Yu
 */
public enum Singleton08 {
    /**
     * 实例
     */
    INSTANCE;
}
