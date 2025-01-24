package com.entrecodigosycafe.studentapp.controller;

import com.entrecodigosycafe.studentapp.model.StudentEntity;
import com.entrecodigosycafe.studentapp.service.StudentService;
import com.entrecodigosycafe.studentapp.view.StudentView;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.Timer;

public class StudentController {

    private final StudentService studentService;
    private final StudentView studentView;
    private Timer timer;

    public StudentController(StudentService studentService, StudentView studentView) {
        this.studentService = studentService;
        this.studentView = studentView;
        cargarDatosEnTabla();
        actualizacionAutomatica(3000);
    }

    private void cargarDatosEnTabla() {
        List<StudentEntity> listarEstudiantes = studentService.getStudentList();
        DefaultTableModel model = studentView.getTableModel();
        model.setRowCount(0);

        for (StudentEntity studentEntity : listarEstudiantes) {
            Object[] estudiante = {
                    studentEntity.getId(),
                    studentEntity.getName(),
                    studentEntity.getLastName(),
                    studentEntity.getAge(),
                    studentEntity.getCountry(),
                    studentEntity.getEmail(),
                    studentEntity.getPhone()
            };
            model.addRow(estudiante);
        }
    }
    private void actualizacionAutomatica ( int intervalo ) {
        timer = new Timer(intervalo, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cargarDatosEnTabla();
            }
        });
        timer.start();
    }
}
