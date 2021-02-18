package com.study.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: renjiahui
 * @date: 2021-02-17 15:10
 * @description:
 */
public class TeamLeader {

    public void checkNumverOfCourses() {

        List<Course> coursesList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            coursesList.add(new Course());
        }

        System.out.println("在线课程的数量是：" + coursesList.size());
    }
}
