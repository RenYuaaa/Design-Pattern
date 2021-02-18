package com.study.design.creational.facotrymethod.example;

/**
 * @author: renjiahui
 * @date: 2021-02-18 23:09
 * @description: 工厂方法模式--具体的子类水果工厂
 */
public class AppleFruitFactory extends FruitFactory {
    @Override
    public Fruit buyFruit() {
        return new AppleFruit();
    }
}
