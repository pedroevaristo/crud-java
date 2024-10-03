package Controller;

import database.DataBaseConnection;

import java.sql.SQLException;

public class Initializer {
    private void initializer_service() throws SQLException {
        DataBaseConnection.getInstance();

    }
}
