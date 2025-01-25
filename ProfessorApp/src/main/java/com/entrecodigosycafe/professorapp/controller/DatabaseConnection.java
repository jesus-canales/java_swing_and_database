package com.entrecodigosycafe.professorapp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static String URL = "jdbc:mysql://localhost:33060/professors_db?useSSL=false&serverTimezone=UTC";
    private static String USER = "root";
    private static String PASS = "entrecodigosycafe";

    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("Error, driver no encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error, no podemos conectarnos a la base de datos.");
            e.printStackTrace();
        }
        return null;
    }

    public static void testConnection() {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                System.out.println("✅ Conexion establecida a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error de conexion");
        }
    }

    public static void main(String[] args) {
        testConnection();
    }
}
