package com.study.design.creational.abstractfactory.mashibing;

/**
 * @author: renjiahui
 * @date: 2021-04-20 0:42
 * @description:
 */
public class Test {

    public static void main(String[] args) {

        //抽象工厂模式--现代人是一个产品族，车、面包、枪是一个具体的产品
        AbstractFactory f = new ModernFactory();
        Food food = f.createFood();
        food.printName();
        Vehicle vehicle = f.createVehicle();
        vehicle.go();
        Weapon weapon = f.createWeapon();
        weapon.fight();

        //抽象工厂模式--古代人是一个产品族，马车、白馒头、剑是一个具体的产品
        AbstractFactory factory = new AncientFactory();
        Food food1 = factory.createFood();
        food1.printName();
        Vehicle vehicle1 = factory.createVehicle();
        vehicle1.go();
        Weapon weapon1 = factory.createWeapon();
        weapon1.fight();
    }
}
