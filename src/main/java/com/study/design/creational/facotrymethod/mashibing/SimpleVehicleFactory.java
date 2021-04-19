package com.study.design.creational.facotrymethod.mashibing;

/**
 * @author: renjiahui
 * @date: 2021-04-20 0:14
 * @description:
 */
public class SimpleVehicleFactory {

    /**
     * 创建汽车
     *
     * @return 汽车对象
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * 创建马车
     *
     * @return 马车对象
     */
    public Carriage createCarriage() {
        return new Carriage();
    }
}
