package dao;

import model.User;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 15.12.16.
 */
public interface UserDao {

    void addUser(String username);

    User getUser(String username);

    List<User> getAllUsers();

    void setUser(String username);

    void deleteUser(String username);
}
