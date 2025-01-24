package com.entrecodigosycafe.studentapp;

import com.entrecodigosycafe.studentapp.controller.StudentController;
import com.entrecodigosycafe.studentapp.service.StudentService;
import com.entrecodigosycafe.studentapp.view.StudentView;

public class AppLauncher {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        StudentView studentView = new StudentView();
        new StudentController(studentService, studentView);
    }
}
