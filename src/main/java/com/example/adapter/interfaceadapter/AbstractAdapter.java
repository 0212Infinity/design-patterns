package com.example.adapter.interfaceadapter;

/**
 * 接口适配器模式/缺省适配器模式
 * <p>
 * 当不需要全部实现接口提供的方法时, 可先设计一个抽象类实现接口, 并为该接口中每个方法提供一个默认实现(空方法),
 * 那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求
 *
 * @author Yu
 */
public abstract class AbstractAdapter implements Interface0 {

    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void m3() {
    }

    @Override
    public void m4() {
    }
}
