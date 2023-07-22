package com.example.adapter.classadapter;

/**
 * 类适配器模式
 * 将一个类的接口转换成另一种接口, 让原本接口不兼容的类可以兼容
 *
 * @author Yu
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    /**
     * 输出 5 伏
     *
     * @return
     */
    @Override
    public int output5V() {
        int srcV = output220V();
        return srcV / 44;
    }
}
