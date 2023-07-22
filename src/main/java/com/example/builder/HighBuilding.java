package com.example.builder;

/**
 * ConcreteBuilder 具体创建者
 * 实现接口，构建和装配各个部件
 *
 * @author Yu
 */
public class HighBuilding extends AbstractHouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("HighBuilding build basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("HighBuilding build walls");
    }

    @Override
    public void roofed() {
        System.out.println("HighBuilding roofed");
    }
}
