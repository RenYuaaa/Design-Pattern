package com.study.design.creational.facotrymethod.example;

/**
 * @author: renjiahui
 * @date: 2021-02-18 23:14
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        //苹果
        AppleFruitFactory appleFruitFactory = new AppleFruitFactory();
        Fruit fruit = appleFruitFactory.buyFruit();
        fruit.buy();

        //橘子
        OrangeFruitFactory orangeFruitFactory = new OrangeFruitFactory();
        orangeFruitFactory.buyFruit().buy();
    }
}
