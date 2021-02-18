package com.study.design.principle.singleresponsibility;

/**
 * @author: renjiahui
 * @date: 2021-02-17 14:39
 * @description: 方法层次说明单一职责原则
 */
public class Method {

    private void updateUserInfo(String userName, String address) {
        userName = "ren";
        address = "杭州";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "ren";

    }

    private void updateUserName(String userName) {
        userName = "ren";
    }


    private void updateAddress(String address) {
        address = "杭州";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //to do something1
        } else {
            //to do something2
        }
    }
}
