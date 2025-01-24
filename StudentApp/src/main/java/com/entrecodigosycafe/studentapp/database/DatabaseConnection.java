package com.entrecodigosycafe.studentapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:33060/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "entrecodigosycafe";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void testConnection() {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                System.out.println("✅ Conexion establecida a la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error de conexion");
        }
    }

    public static void main(String[] args) {
        testConnection();
    }
}
