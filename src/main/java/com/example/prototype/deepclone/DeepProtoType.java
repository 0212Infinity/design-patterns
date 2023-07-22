package com.example.prototype.deepclone;

import java.io.*;

/**
 * 深拷贝
 *
 * @author Yu
 */
public class DeepProtoType implements Serializable, Cloneable {

    private String name;

    private DeepCloneableTarget deepCloneableTarget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    /**
     * 深拷贝 - 使用 clone 方法
     *
     * @return Object
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 对 基本数据类型(属性) 和 String 的克隆
        deep = super.clone();
        // 对引用类型的克隆
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        if (deepCloneableTarget != null) {
            deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        }
        return deepProtoType;
    }

    /**
     * 深拷贝 - 通过对象的序列化实现 (推荐)
     *
     * @return Object
     */
    public Object deepClone() {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            // 序列化
            oos.writeObject(this);
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                // 反序列化
                DeepProtoType copyObj = (DeepProtoType) ois.readObject();
                return copyObj;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
