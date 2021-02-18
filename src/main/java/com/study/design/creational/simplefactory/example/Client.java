package com.study.design.creational.simplefactory.example;

/**
 * @author: renjiahui
 * @date: 2021-02-18 22:13
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        try {
            Fruit fruit = FruitFactory.buyFruit("apple");
            //多态--父类的引用指向子类的对象、接口的引用指向实现类的对象
            fruit.buy();
        } catch (Exception e) {
            System.out.println("没有买到想要吃的水果");
        }
    }
}
