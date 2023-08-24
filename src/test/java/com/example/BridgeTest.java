package com.example;

import com.example.bridge.*;

public class BridgeTest {

    public static void main(String[] args) {
        UpRightPhone phone1 = new UpRightPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        UpRightPhone phone2 = new UpRightPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
