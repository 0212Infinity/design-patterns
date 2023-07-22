package com.example.adapter.objectadapter;

/**
 * 电压 220 伏类
 *
 * @author Yu
 */
public class Voltage220V {

    /**
     * 输出 220 伏
     *
     * @return int
     */
    public int output220V() {
        int src = 220;
        System.out.println("Voltage(V): " + src);
        return src;
    }
}
