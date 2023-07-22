package com.example.factory.method;

/**
 * 橘子工厂
 *
 * @author Yu
 */
public class OrangeFactory extends AbstractFruitFactory<Orange> {

    /**
     * 获取橘子对象
     *
     * @return 橘子对象
     */
    @Override
    public Orange getFruit() {
        return new Orange();
    }
}
