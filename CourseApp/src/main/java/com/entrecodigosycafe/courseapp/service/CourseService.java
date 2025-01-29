package com.entrecodigosycafe.courseapp.service;

import com.entrecodigosycafe.courseapp.model.CourseDAO;
import com.entrecodigosycafe.courseapp.model.CourseEntity;

public class CourseService {

    private CourseDAO courseDAO;

    public CourseService() {
        courseDAO = new CourseDAO();
    }

    public void saveCourse ( CourseEntity courseEntity ) {

        if ( courseEntity.getName() == null || courseEntity.getName().isEmpty() ) {
            System.out.println("Debe agregar un nombre de curso");
            return;
        }
        if ( courseEntity.getPrice() <= 0 ) {
            System.out.println("El precio debe ser mayor que 0");
            return;
        }

        courseDAO.insertCourse(courseEntity);
    }
}
