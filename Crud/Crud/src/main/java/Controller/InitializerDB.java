package Controller;

import database.DataBaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class InitializerDB {

    protected boolean initializerService() throws SQLException {
        DataBaseConnection db_connect = DataBaseConnection.getInstance();
        return db_connect.initializeConnection();
    }
    public boolean exceptionLoop() throws SQLException {
        return initializerService();
    }
}
