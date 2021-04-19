package com.study.design.creational.abstractfactory.mashibing;

/**
 * @author: renjiahui
 * @date: 2021-04-20 0:44
 * @description:
 */
public class AncientFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new SteamedBread();
    }

    @Override
    Vehicle createVehicle() {
        return new Carriage();
    }

    @Override
    Weapon createWeapon() {
        return new Sword();
    }
}
