package com.example.factory.abstract0;

/**
 * 小米工厂
 *
 * @author Yu
 */
public class XiaoMiFactory extends AbstractFactory {

    @Override
    public Phone getPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Pad getPad() {
        return new XiaoMiPad();
    }
}
