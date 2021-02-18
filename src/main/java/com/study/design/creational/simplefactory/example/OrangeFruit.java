package com.study.design.creational.simplefactory.example;

/**
 * @author: renjiahui
 * @date: 2021-02-18 22:09
 * @description: 简单工厂模式--具体的实现：橘子类型
 */
public class OrangeFruit extends Fruit {
    @Override
    public void buy() {
        System.out.println("买了一些橘子");
    }
}
