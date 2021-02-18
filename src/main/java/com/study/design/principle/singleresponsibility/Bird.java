package com.study.design.principle.singleresponsibility;

/**
 * @author: renjiahui
 * @date: 2021-02-17 14:25
 * @description: 违反了单一职责原则。一个方法中有两个职责：有鸵鸟则用脚走，有大雁则用翅膀飞，如果增加一种企鹅，则会走有翅膀飞中
 */
public class Bird {

    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
