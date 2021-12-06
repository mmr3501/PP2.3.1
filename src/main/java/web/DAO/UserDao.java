package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void removeUser(User user);

    List<User> getAllUsers();

    void changeUser(Long id, User user);

    User getUserById(Long id);

    void removeUserById(Long id);

}
