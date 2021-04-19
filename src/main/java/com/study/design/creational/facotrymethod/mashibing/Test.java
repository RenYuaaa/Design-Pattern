package com.study.design.creational.facotrymethod.mashibing;

/**
 * @author: renjiahui
 * @date: 2021-04-20 0:13
 * @description:
 */
public class Test {

    public static void main(String[] args) {

        //工厂方法模式--创建汽车
        Moveable moveable = new CarFactory().create();
        moveable.go();

        //工厂方法模式--创建马车
        Moveable moveable1 = new CarriageFactory().create();
        moveable1.go();

        //简单工厂模式--创建汽车
        SimpleVehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();
        Car car = simpleVehicleFactory.createCar();
        car.go();

        //简单工厂模式--创建马车
        Carriage carriage = simpleVehicleFactory.createCarriage();
        carriage.go();
    }
}
