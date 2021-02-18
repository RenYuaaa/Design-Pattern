package com.study.design.creational.facotrymethod.example;

/**
 * @author: renjiahui
 * @date: 2021-02-18 23:08
 * @description: 工厂方法模式--具体的水果类型：橘子类型
 */
public class OrangeFruit extends Fruit {
    @Override
    public void buy() {
        System.out.println("买了一些橘子");
    }
}
