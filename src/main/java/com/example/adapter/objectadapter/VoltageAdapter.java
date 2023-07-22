package com.example.adapter.objectadapter;

/**
 * 对象适配器模式
 * 基本思路和类的适配器模式相同, 只是将 Adapter 类作修改, 不是继承 src类, 而是持有src类的实, 以解决兼容性的问题
 * 即: 持有 src 类, 实现 dst 类接口, 完成 src->dst 的适配
 *
 * @author Yu
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220v) {
        this.voltage220V = voltage220v;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V != null) {
            int src = voltage220V.output220V();
            dst = src / 44;
        }
        return dst;
    }
}
