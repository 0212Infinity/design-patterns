package com.example;

import com.example.factory.abstract0.HuaWeiFactory;
import com.example.factory.abstract0.Pad;
import com.example.factory.abstract0.Phone;
import com.example.factory.abstract0.XiaoMiFactory;
import com.example.factory.simple.Apple;
import com.example.factory.method.AppleFactory;
import com.example.factory.method.OrangeFactory;
import com.example.factory.simple.FruitFactory;
import com.example.factory.simple.Orange;

public class FactoryTest {

    public static void main(String[] args) {
        // 简单工厂模式
        Apple apple = (Apple) FruitFactory.getFruit("苹果");
        Orange orange = (Orange) FruitFactory.getFruit("橘子");
        System.out.println(apple);
        System.out.println(orange);

        // 工厂方法模式
        com.example.factory.method.Apple apple2 = new AppleFactory().getFruit();
        com.example.factory.method.Orange orange2 = new OrangeFactory().getFruit();
        System.out.println(apple2);
        System.out.println(orange2);

        // 抽象工厂模式
        Phone xiaomiPhone = new XiaoMiFactory().getPhone();
        Phone huaweiPhone = new HuaWeiFactory().getPhone();
        Pad xiaoMiPad = new XiaoMiFactory().getPad();
        Pad huaweiPad = new HuaWeiFactory().getPad();
        xiaomiPhone.call();
        huaweiPhone.call();
        xiaoMiPad.video();
        huaweiPad.video();
    }
}
