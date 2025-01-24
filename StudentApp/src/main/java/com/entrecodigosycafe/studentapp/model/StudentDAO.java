package com.entrecodigosycafe.studentapp.model;

import com.entrecodigosycafe.studentapp.database.DatabaseConnection;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<StudentEntity> listarRegistros () throws SQLException {
        List<StudentEntity> lista = new ArrayList<>();
        String query = "select id, nombre, apellidos, edad, pais, correo, celular  from estudiantes";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                StudentEntity estudiante = new StudentEntity(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getInt("edad"),
                        rs.getString("pais"),
                        rs.getString("correo"),
                        rs.getString("celular")
                );
                lista.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
