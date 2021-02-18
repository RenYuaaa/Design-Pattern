package com.study.design.principle.openclose;

/**
 * @author: renjiahui
 * @date: 2021-02-17 11:07
 * @description:
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
