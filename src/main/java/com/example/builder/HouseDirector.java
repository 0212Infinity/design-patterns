package com.example.builder;

/**
 * Director 指挥官
 * 构建一个使用 Builder 接口的对象
 * 它主要是用于创建一个复杂的对象
 * 它主要有两个作用, 1.隔离了客户与对象的生产过程 2.负责控制产品对象的生产过程
 *
 * @author Yu
 */
public class HouseDirector {

    AbstractHouseBuilder houseBuilder = null;

    public HouseDirector(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
