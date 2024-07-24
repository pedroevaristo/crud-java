package database;
import model.DAO.User;
import database.UserDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Collections;
import java.util.List;


public class dataBaseConnection implements UserDAO {
    private static dataBaseConnection instance;
    private static Connection conn;
    private static final String jdbcPostgreSQL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String nameRoot = "postgres";
    private static final String passwordRoot ="aY5:4I6c";

    private void dataBaseConnection() {
        try {
            this.conn = DriverManager.getConnection(jdbcPostgreSQL, nameRoot, passwordRoot);
        }
        catch (SQLException e) {
            throw new RuntimeException("Erro ao estabelecer a conexão com banco de dados");
        }
    }
    public static synchronized dataBaseConnection getInstance(){
        if(instance == null){
            synchronized (dataBaseConnection.class) {
                instance = new dataBaseConnection();
            }
        }
        return instance;
    }

    @Override
    public List<User> get_all_users() {
        return Collections.emptyList();
    }

    @Override
    public User consult_user(int id) {
        return null;
    }

    @Override
    public void delete_user(User user) {

    }

    @Override
    public void update_user(User user) {

    }

    @Override
    public void add_user(User user) {

    }
}
