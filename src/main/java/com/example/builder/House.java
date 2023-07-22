package com.example.builder;

/**
 * 房子类
 * Product 产品角色
 * 一个具体的产品对象
 *
 * @author Yu
 */
public class House {

    private String baise;

    private String wall;

    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
