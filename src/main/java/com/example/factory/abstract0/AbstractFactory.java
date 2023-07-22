package com.example.factory.abstract0;

/**
 * 抽象工厂
 * 抽象工厂模式围绕一个超级工厂创建其他工厂
 * 该超级工厂又称为其他工厂的工厂
 *
 * @author Yu
 */
public abstract class AbstractFactory {

    /**
     * 获取手机
     *
     * @return 手机对象
     */
    public abstract Phone getPhone();

    /**
     * 获取平板
     *
     * @return 平板对象
     */
    public abstract Pad getPad();
}
