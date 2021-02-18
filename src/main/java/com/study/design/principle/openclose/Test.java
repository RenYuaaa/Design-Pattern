package com.study.design.principle.openclose;

/**
 * @author: renjiahui
 * @date: 2021-02-17 11:01
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaCourse(96, "Java", 348D);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
        System.out.println("课程ID：" + javaCourse.getId() + ", 课程名称：" + javaCourse.getName() + ", 课程价格：" + javaCourse.getPrice() );
    }
}
