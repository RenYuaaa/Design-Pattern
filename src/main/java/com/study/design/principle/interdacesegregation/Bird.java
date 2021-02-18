package com.study.design.principle.interdacesegregation;

/**
 * @author: renjiahui
 * @date: 2021-02-17 14:51
 * @description: bird不会游泳，但必须要实现fly方法，违反了接口隔离原则
 */
public class Bird implements IAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swiming() {

    }
}
