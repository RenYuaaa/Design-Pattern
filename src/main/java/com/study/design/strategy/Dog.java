package com.study.design.strategy;

/**
 * @author: renjiahui
 * @date: 2021-04-12 23:19
 * @description:
 */
public class Dog implements Comparable<Dog> {

    Integer food;

    public Dog(Integer food) {
        this.food = food;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog dog) {
        if (this.food < dog.food) {
            return -1;
        } else if (this.food > dog.food) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }

}
