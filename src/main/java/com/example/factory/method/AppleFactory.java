package com.example.factory.method;

/**
 * 苹果工厂
 *
 * @author Yu
 */
public class AppleFactory extends AbstractFruitFactory<Apple> {

    /**
     * 获取苹果对象
     *
     * @return 苹果对象
     */
    @Override
    public Apple getFruit() {
        return new Apple();
    }
}
