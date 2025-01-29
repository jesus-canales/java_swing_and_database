package com.entrecodigosycafe.courseapp;

import com.entrecodigosycafe.courseapp.controller.CourseController;
import com.entrecodigosycafe.courseapp.service.CourseService;
import com.entrecodigosycafe.courseapp.view.CourseView;

public class AppLauncher {

    public static void main(String[] args) {

        CourseView view = new CourseView();
        CourseService service = new CourseService();
        new CourseController(view, service);

    }
}
