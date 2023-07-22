package com.example.adapter.objectadapter;

/**
 * 手机类
 *
 * @author Yu
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("Normal charging!");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("Voltage too high!");
        }
    }
}
