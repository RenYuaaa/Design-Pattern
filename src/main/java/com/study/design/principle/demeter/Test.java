package com.study.design.principle.demeter;

/**
 * @author: renjiahui
 * @date: 2021-02-17 15:13
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
