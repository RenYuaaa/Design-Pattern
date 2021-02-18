package com.study.design.creational.simplefactory;

/**
 * @author: renjiahui
 * @date: 2021-02-17 15:34
 * @description:
 */
public class VideoFactory {

//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }

    public Video getVideo(Class clazz) {
        Video video = null;

        try {
            video = (Video)Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
