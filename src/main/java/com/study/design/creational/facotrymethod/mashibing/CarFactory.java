package com.study.design.creational.facotrymethod.mashibing;

/**
 * @author: renjiahui
 * @date: 2021-04-20 0:09
 * @description:
 */
public class CarFactory {

    public Moveable create() {
        System.out.println("a car created");
        return new Car();
    }
}
