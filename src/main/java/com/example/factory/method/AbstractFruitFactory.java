package com.example.factory.method;

/**
 * 水果工厂
 * 将水果工厂抽象为抽象类，添加泛型 T 由子类指定水果类型
 * 工厂方法模式用来生产同一等级结构中的固定产品 (支持增加任意产品)
 *
 * @author Yu
 */
public abstract class AbstractFruitFactory<T extends Fruit> {

    /**
     * 不同的水果工厂，通过此方法生产不同的水果
     *
     * @return 水果对象
     */
    public abstract T getFruit();
}
