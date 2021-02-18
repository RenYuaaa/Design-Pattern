package com.study.design.creational.simplefactory.example;

/**
 * @author: renjiahui
 * @date: 2021-02-18 22:04
 * @description: 简单工厂模式--具体的实现：苹果类型
 */
public class AppleFruit extends Fruit {
    @Override
    public void buy() {
        System.out.println("买了一些苹果");
    }
}
