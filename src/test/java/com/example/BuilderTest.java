package com.example;

import com.example.builder.CommonHouse;
import com.example.builder.HighBuilding;
import com.example.builder.House;
import com.example.builder.HouseDirector;

/**
 * 抽象工厂模式 vs 建造者模式
 * 抽象工厂模式实现对产品家族的创建, 一个产品家族是这样的一系列产品: 具有不同分类维度的产品组合, 采用抽象工厂模式不需要关心构建过程, 只关心什么产品由什么工厂生产即可
 * 而建造者模式则是要求按照指定的蓝图建造产品, 它的主要目的是通过组装零配件而产生一个新产品
 */
public class BuilderTest {

    public static void main(String[] args) {
        // 普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 返回产品(普通房子)
        House house = houseDirector.constructHouse();

        // 高楼
        HighBuilding highBuilding = new HighBuilding();
        // 重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        // 返回产品(高楼)
        House house2 = houseDirector.constructHouse();
    }
}
