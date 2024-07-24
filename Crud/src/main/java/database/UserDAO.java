package database;

import model.DAO.User;

import java.util.List;

public interface UserDAO{
    public List<User> get_all_users();
    public User consult_user(int id);
    public void delete_user(User user);
    public void update_user(User user);
    public void add_user(User user);
}
