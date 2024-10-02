package Controller;

import database.DataBaseConnection;
import model.DAO.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.DataBaseConnection.*;

public class DAOoperation implements operation<User>{

    @Override
    public void create(User user_db) throws SQLException {
        String sql = "INSERT INTO users (name_user, date_of_birth, email_user, cep_user, address_user, complement_address values (?,?,?,?,?,?)";
        try(Connection conn = DataBaseConnection.getInstance().getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1,user_db.getName_user());
            pstmt.setInt(2,user_db.getDate_of_birth());
            pstmt.setString(3,user_db.getEmail_user());
            pstmt.setString(4,user_db.getCep_user());
            pstmt.setString(5,user_db.getAddress_user());
            pstmt.setString(6,user_db.getComplement_address());

            pstmt.executeUpdate();
        }

    }

    @Override
    public User consult(int id) throws SQLException {
        String sql = "SELECT * FROM users WHERE id = ?";
        User user = null;
        try (Connection conn = DataBaseConnection.getInstance().getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                user = new User(
                        rs.getString("name_user"),
                        rs.getInt("date_of_birth"),
                        rs.getString("email_user"),
                        rs.getString("cep_user"),
                        rs.getString("address_user"),
                        rs.getString("complement_address")
                );
            }

        }
        return user;
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";

        try(Connection conn = DataBaseConnection.getInstance().getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    @Override
    public void update(User user_db) throws SQLException {
        String sql = "UPDATE users SET name_user = ?, date_of_birth = ?, email_user =?, cep_user = ?, address_user = ?, complement_address = ?";
        try(Connection conn = DataBaseConnection.getInstance().getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1,user_db.getName_user());
            pstmt.setInt(2,user_db.getDate_of_birth());
            pstmt.setString(3,user_db.getEmail_user());
            pstmt.setString(4,user_db.getCep_user());
            pstmt.setString(5,user_db.getAddress_user());
            pstmt.setString(6,user_db.getComplement_address());
        }
    }
}
