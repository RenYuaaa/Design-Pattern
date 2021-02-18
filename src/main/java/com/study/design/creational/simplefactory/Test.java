package com.study.design.creational.simplefactory;

import java.util.Objects;

/**
 * @author: renjiahui
 * @date: 2021-02-17 15:32
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        //v1
//        Video javaVideo = new JavaVideo();
//        javaVideo.produce();
//
//        Video pythonVideo = new PythonVideo();
//        pythonVideo.produce();

        //v2
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (Objects.isNull(video)) {
//            return;
//        }
//
//        video.produce();

        //v3 通过反射生成
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (Objects.isNull(video)) {
            return;
        }

        video.produce();

    }
}
