package com.entrecodigosycafe.professorapp.model;

import com.entrecodigosycafe.professorapp.database.DatabaseConnection;

import java.sql.*;

public class ProfessorDAO {

    public void addProfessor ( ProfessorEntity professor ) {

        String insert = "INSERT INTO professors (nombre, apellidos, fecha_nacimiento, lugar_origen, genero, tecnologias, modalidad) VALUES (?,?,?,?,?,?,?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(insert)) {

            stmt.setString(1, professor.getName());
            stmt.setString(2, professor.getLastName());
            stmt.setString(3, professor.getBirthDate());
            stmt.setString(4, professor.getPlaceOfOrigin());
            stmt.setString(5, professor.getGender());
            stmt.setString(6, professor.getTechnologies());
            stmt.setString(7, professor.getModality());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Profesor agregado satisfactoriamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar el profesor.");
            e.printStackTrace();
        }

    }
}
