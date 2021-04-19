package com.study.design.creational.facotrymethod.mashibing;

/**
 * @author: renjiahui
 * @date: 2021-04-20 0:10
 * @description:
 */
public class CarriageFactory {

    public Moveable create() {
        System.out.println("a carriage created");
        return new Carriage();
    }
}
