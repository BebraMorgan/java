package org.calvian.framework.database;

import java.sql.*;

public class DataBase extends DataBaseData {
    private Connection connection;


    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return connection;
    }

    public void update(String request) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = getConnection().prepareStatement(request);
        preparedStatement.executeUpdate();
        connection.close();
    }

    public ResultSet select(String request) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = getConnection().prepareStatement(request);
        ResultSet resultSet = preparedStatement.getResultSet();
        connection.close();
        return  resultSet;
    }

    public void createTable(String tableName) throws SQLException, ClassNotFoundException {
        String request = "CREATE TABLE IF NOT EXISTS " + tableName + ";";
        PreparedStatement preparedStatement = getConnection().prepareStatement(request);
        preparedStatement.executeUpdate();
        connection.close();
    }

    public void dropTable(String tableName) throws SQLException, ClassNotFoundException {
        String request = "DROP TABLE " + tableName + ";";
        PreparedStatement preparedStatement = getConnection().prepareStatement(request);
        preparedStatement.executeUpdate();
        connection.close();
    }






}
