package com.example;

import com.example.adapter.classadapter.Phone;
import com.example.adapter.classadapter.VoltageAdapter;
import com.example.adapter.interfaceadapter.AbstractAdapter;
import com.example.adapter.objectadapter.Voltage220V;
import com.example.adapter.springmvc.DispatchServlet;

public class AdapterTest {

    public static void main(String[] args) {
        // 类适配器模式
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());

        // 对象适配器模式
        com.example.adapter.objectadapter.Phone phone2 = new com.example.adapter.objectadapter.Phone();
        phone2.charging(new com.example.adapter.objectadapter.VoltageAdapter(new Voltage220V()));

        // 接口适配器模式/缺省适配器模式
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("实现 m1 方法");
            }
        };
        abstractAdapter.m1();

        // SpringMVC
        new DispatchServlet().doDispatch();
    }
}
