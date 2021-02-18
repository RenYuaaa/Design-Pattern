package com.study.design.principle.dependenceinversion;

/**
 * @author: renjiahui
 * @date: 2021-02-17 11:21
 * @description: 依赖倒置原则：高层次模块不应该依赖低层次模块
 * Ren--高层模块
 * 其他的学习各种课程--底层模块
 */
public class Test {

    // v1版本  如果使用该类中的方法，那么每新学一种课程都要新增加一个方法，扩展性差
//    public static void main(String[] args) {
//        Ren ren = new Ren();
//        ren.studyJavaCourse();
//        ren.studyPythonCourse();
//    }

    //v2 接口方法注入的方式
//    public static void main(String[] args) {
//        Ren ren = new Ren();
//        ren.stydyCourse(new JavaCourse());
//        ren.stydyCourse(new FECourse());
//    }

    //v3 构造器注入
//    public static void main(String[] args) {
//        Ren ren = new Ren(new JavaCourse());
//        ren.studyCourse();
//
//        Ren ren1 = new Ren(new FECourse());
//        ren1.studyCourse();
//    }

    //v4 set注入方式
    public static void main(String[] args) {
        Ren ren = new Ren();
        ren.setiCourse(new JavaCourse());
        ren.studyCourse();

        ren.setiCourse(new PythonCourse());
        ren.studyCourse();
    }
}
