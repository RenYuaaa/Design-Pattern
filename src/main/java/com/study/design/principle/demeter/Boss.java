package com.study.design.principle.demeter;

/**
 * @author: renjiahui
 * @date: 2021-02-17 15:10
 * @description: 迪米特法则：teamLeader是直接的朋友，方法体内部的Course就不是直接的朋友
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        //v1
//        List<Course> coursesList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            coursesList.add(new Course());
//        }

        teamLeader.checkNumverOfCourses();
    }
}
