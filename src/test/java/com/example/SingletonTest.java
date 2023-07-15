package com.example;

import com.example.singleton.*;

public class SingletonTest {

    public static void main(String[] args) {
        /*Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();*/
        /*Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();*/
        /*Singleton03 instance = Singleton03.getInstance();
        Singleton03 instance2 = Singleton03.getInstance();*/
        /*Singleton04 instance = Singleton04.getInstance();
        Singleton04 instance2 = Singleton04.getInstance();*/
        /*Singleton05 instance = Singleton05.getInstance();
        Singleton05 instance2 = Singleton05.getInstance();*/
        /*Singleton06 instance = Singleton06.getInstance();
        Singleton06 instance2 = Singleton06.getInstance();*/
        /*Singleton07 instance = Singleton07.getInstance();
        Singleton07 instance2 = Singleton07.getInstance();*/
        Singleton08 instance = Singleton08.INSTANCE;
        Singleton08 instance2 = Singleton08.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
