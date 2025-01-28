package com.entrecodigosycafe.courseapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:33060/coursedb?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "entrecodigosycafe";

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: driver no encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: no se puede conectar con la base de datos");
            e.printStackTrace();
        }
        return null;
    }

    public static void testConnection() {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                System.out.println("✅ Conectado satisfactoriamente!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión");
        }
    }

    public static void main(String[] args) {
        testConnection();
    }
}
