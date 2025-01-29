package com.entrecodigosycafe.courseapp.controller;

import com.entrecodigosycafe.courseapp.model.CourseEntity;
import com.entrecodigosycafe.courseapp.service.CourseService;
import com.entrecodigosycafe.courseapp.view.CourseView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseController {

    private CourseView view;
    private CourseService service;

    public CourseController (CourseView view, CourseService service) {
        this.view = view;
        this.service = service;

        this.view.addListenerSave(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveCourse();
            }
        });

        this.view.viewForm();
    }

    private void saveCourse() {
        String name = view.getCourse();
        String price = view.getPrice();

        try {
            CourseEntity course = new CourseEntity(name, Double.parseDouble(price));
            service.saveCourse(course);
            JOptionPane.showMessageDialog(view, "Curso registrado satisfactoriamente");
            view.clearForm();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Error al registrar el Curso");
        }
    }
}
