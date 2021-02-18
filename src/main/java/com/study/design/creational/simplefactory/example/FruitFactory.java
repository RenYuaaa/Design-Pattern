package com.study.design.creational.simplefactory.example;

/**
 * @author: renjiahui
 * @date: 2021-02-18 22:03
 * @description: 简单工厂模式--水果工厂
 * 简单工厂模式的优点：
 * 1、只传入一个参数就可以获取具体的对象，不需要其中的过程
 *
 * 简单工厂模式存在的缺点：
 * 1、工厂类的职责过重，每增加一种类型就需要对工厂类进行一次修改
 * 2、违背了开闭原则（类、模块、函数应对扩展开放，对修改关闭）
 */
public class FruitFactory {

    public static Fruit buyFruit(String fruitType) throws Exception {
        if (fruitType.equalsIgnoreCase(FruitEnum.APPLE.toString())) {
            return new AppleFruit();
        } else if (fruitType.equals(FruitEnum.ORANGE.toString())) {
            return new OrangeFruit();
        } else {
            throw new Exception("对不起，暂没有其他品种水果出售");
        }
    }

}
