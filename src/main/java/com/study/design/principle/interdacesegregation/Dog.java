package com.study.design.principle.interdacesegregation;

/**
 * @author: renjiahui
 * @date: 2021-02-17 14:50
 * @description: dog不会飞，但必须要实现fly方法，违反了接口隔离原则
 */
public class Dog implements ISwimmingAnimalAction, IEatAnimalAction {

    @Override
    public void eat() {

    }

//    @Override
//    public void fly() {
//
//    }

    @Override
    public void swimming() {

    }
}
