package Controller;

import java.sql.SQLException;

public interface operation<User> {
    void create(User user_db) throws SQLException;
    User consult(int id) throws SQLException;
    void delete(int id) throws SQLException;
    void update(User user_db) throws SQLException;

}
