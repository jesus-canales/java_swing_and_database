package com.entrecodigosycafe.courseapp.model;

import com.entrecodigosycafe.courseapp.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseDAO {

    private Connection connection;

    public CourseDAO() {
        connection = DatabaseConnection.getConnection();
    }

    public void insertCourse ( CourseEntity courseEntity ) {
        try ( PreparedStatement statement = connection.prepareStatement(
                " INSERT INTO course (nombre, precio) VALUES (?, ?) ")) {
            statement.setString(1, courseEntity.getName());
            statement.setDouble(2, courseEntity.getPrice());
            statement.executeUpdate();
            System.out.println("Courso agregado satisfactoriamente");
            } catch ( SQLException e) {
                System.out.println("No se ha insertado el nuevo curso");
                e.printStackTrace();
        }
    }
}
