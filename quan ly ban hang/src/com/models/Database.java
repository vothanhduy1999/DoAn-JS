package com.models;

import java.io.File;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final static String DB_PATH = "product.db";

    private Connection connection;

    public Database() {
        File file = new File("db");
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("auto created directory 'db'");
            }
        }
        final String url = "jdbc:sqlite:db/" + DB_PATH;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
