package com.study.design.creational.facotrymethod.example;

/**
 * @author: renjiahui
 * @date: 2021-02-18 23:10
 * @description: 工厂方法模式--具体的子类水果工厂
 */
public class OrangeFruitFactory extends FruitFactory {
    @Override
    public Fruit buyFruit() {
        return new OrangeFruit();
    }
}
