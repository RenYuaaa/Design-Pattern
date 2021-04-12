package com.study.design.strategy;

/**
 * @author: renjiahui
 * @date: 2021-04-12 22:51
 * @description:
 */
public class Cat implements Comparable<Cat> {

    Integer weight;

    Integer height;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Cat(Integer weight, Integer height) {
        this.weight = weight;
        this.height = height;
    }

    /**
     * 使用Comparable接口
     *
     * @param c
     * @return
     */
    @Override
    public int compareTo(Cat c) {
        if (this.weight < c.weight) {
            return -1;
        } else if (this.weight > c.weight) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
