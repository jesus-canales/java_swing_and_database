package com.entrecodigosycafe.studentapp.service;

import com.entrecodigosycafe.studentapp.model.StudentDAO;
import com.entrecodigosycafe.studentapp.model.StudentEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private StudentDAO estudianteDAO = new StudentDAO();

    public List<StudentEntity> getStudentList () {
        List<StudentEntity> lista = new ArrayList<>();
        try {
            lista = estudianteDAO.listarRegistros();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
