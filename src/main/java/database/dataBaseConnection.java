package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class dataBaseConnection {
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
    public void addUSer(){

    }

}
