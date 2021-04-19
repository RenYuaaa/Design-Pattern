package com.study.design.creational.abstractfactory.mashibing;

/**
 * @author: renjiahui
 * @date: 2021-04-20 0:43
 * @description:
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new Rifle();
    }
}
