package com.laca.ConnectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

        private String driverClassName;
        private String url;
        private String username;
        private String password;

        private static ConnectDB instance = new ConnectDB();

        public ConnectDB() {
            this.driverClassName="org.mariadb.jdbc.Driver";
            this.url="jdbc:mariadb://localhost:3306/data";
            this.username="admin";
            this.password="admin";
        }
        public static ConnectDB getInstance(){
            return instance;
        }

        public Connection getConnection() throws SQLException {
            try {
                Class.forName(driverClassName);
                return DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver class not found", e);
            }
        }

    }
