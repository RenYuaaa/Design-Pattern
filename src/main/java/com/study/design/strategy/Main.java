package com.study.design.strategy;

import java.util.Arrays;

/**
 * @author: renjiahui
 * @date: 2021-04-12 22:57
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        Cat[] c = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};

        Dog[] d = {new Dog(3), new Dog(5), new Dog(1)};
        Sorter.sort1(d);

        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(d, new DogComparator());

        Sorter<Cat> sorter1 = new Sorter<>();
//        sorter1.sort(c, new CatHeightComparator());
        sorter1.sort(c, new CatWeightComparator());
        System.out.println(Arrays.toString(c));

    }
}
