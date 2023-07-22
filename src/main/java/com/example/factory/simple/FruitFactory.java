package com.example.factory.simple;

/**
 * 水果工厂
 * 用来生产同一等级结构中的任意产品 (对于增加新的产品, 需要覆盖已有代码)
 *
 * @author Yu
 */
public class FruitFactory {

    /**
     * 这里就直接来一个静态方法根据指定类型进行创建
     *
     * @param type 水果类型
     * @return 对应的水果对象
     */
    public static Fruit getFruit(String type) {
        return switch (type) {
            case "苹果" -> new Apple();
            case "橘子" -> new Orange();
            default -> null;
        };
    }
}
