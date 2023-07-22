package com.example;

import com.example.prototype.deepclone.DeepCloneableTarget;
import com.example.prototype.deepclone.DeepProtoType;
import com.example.prototype.shallowclone.Sheep;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 传统方式
        /*com.example.prototype.Sheep sheep = new com.example.prototype.Sheep("mie", 1, "White");
        com.example.prototype.Sheep sheep2 = new com.example.prototype.Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        com.example.prototype.Sheep sheep3 = new com.example.prototype.Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);*/

        // 浅克隆
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("jack", 2, "黑色"));

        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.getFriend().hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.getFriend().hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.getFriend().hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.getFriend().hashCode());

        // 深拷贝
        DeepProtoType p = new DeepProtoType();
        p.setName("张三");
        p.setDeepCloneableTarget(new DeepCloneableTarget("testName", "testClass"));
        // 深拷贝 - 使用 clone 方法
        DeepProtoType p2 = (DeepProtoType) p.clone();
        System.out.println("p.name=" + p.getName() + "p.deepCloneableTarget=" + p.getDeepCloneableTarget().hashCode());
        System.out.println("p2.name=" + p2.getName() + "p2.deepCloneableTarget=" + p2.getDeepCloneableTarget().hashCode());
        // 深拷贝 - 通过对象的序列化实现
        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println("p.name=" + p.getName() + "p.deepCloneableTarget=" + p.getDeepCloneableTarget().hashCode());
        System.out.println("p3.name=" + p3.getName() + "p3.deepCloneableTarget=" + p3.getDeepCloneableTarget().hashCode());
    }
}
