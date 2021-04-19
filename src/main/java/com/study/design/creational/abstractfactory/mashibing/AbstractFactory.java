package com.study.design.creational.abstractfactory.mashibing;

/**
 * @author: renjiahui
 * @date: 2021-04-20 0:22
 * @description:
 */
public abstract class AbstractFactory {

    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();

}
