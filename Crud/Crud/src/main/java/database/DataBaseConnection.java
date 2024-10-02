package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Controller.operation;
import Controller.operation.*;
import model.DAO.User;


public class DataBaseConnection {
    private static DataBaseConnection instance;
    private static Connection conn;
    private static final String jdbcPostgreSQL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String nameRoot = "postgres";
    private static final String passwordRoot ="aY5:4I6c"; //Until here is information nescessary to connect with

    private void DataBaseConnection() { //give a test if is working propely
        try {
            this.conn = DriverManager.getConnection(jdbcPostgreSQL, nameRoot, passwordRoot);//Here is connection from database
        }
        catch (SQLException e) {
            throw new RuntimeException("Erro ao estabelecer a conexão com banco de dados");
        }
    }

    public Connection getConnection(){// here is beginning of pattern design
        return conn;
    }

    public static synchronized DataBaseConnection getInstance() throws SQLException{
        if(instance == null){
            instance = new DataBaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DataBaseConnection();
        }
        return instance;
    }

}
