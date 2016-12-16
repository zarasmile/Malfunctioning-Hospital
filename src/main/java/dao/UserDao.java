package dao;

import model.User;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 15.12.16.
 */
public interface UserDao {

    // Создает новую запись и соответствующего ей пользователя
    void addUser(String username);

    // Возвращает пользователя соответствующего записи с первичным ключом username или null
    User getUser(String username);

    // Возвращает список пользователей соответствующих всем записям в базе данных
    List<User> getAllUsers();

    // Сохраняет состояние пользователя в базе данных
    void setUser(String username);

    // Удаляет запись о пользователе из базы данных
    void deleteUser(String username);
}
