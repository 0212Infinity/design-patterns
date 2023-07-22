package com.example;

import com.example.builder.CommonHouse;
import com.example.builder.HighBuilding;
import com.example.builder.House;
import com.example.builder.HouseDirector;

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
