package com.example.factory.abstract0;

/**
 * 华为工厂
 *
 * @author Yu
 */
public class HuaWeiFactory extends AbstractFactory {

    @Override
    public Phone getPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Pad getPad() {
        return new HuaWeiPad();
    }
}
