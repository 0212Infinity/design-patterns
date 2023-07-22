package com.example.builder;


/**
 * Builder 抽象建造者
 * 创建一个 Product 对象的各个部件指定的接口/抽象类
 *
 * @author Yu
 */
public abstract class AbstractHouseBuilder {

    protected House house = new House();

    /**
     * 构建地基
     */
    public abstract void buildBasic();

    /**
     * 构建墙
     */
    public abstract void buildWalls();

    /**
     * 构建屋顶
     */
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
