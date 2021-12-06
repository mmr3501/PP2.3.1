package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {


    private final UserDao dao;

    @Autowired
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Transactional
    @Override
    public void removeUserById(Long id) {
        dao.removeUserById(id);
    }

    @Override
    public User getUserById(Long id) {
        return dao.getUserById(id);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Transactional
    @Override
    public void removeUser(User user) {
        dao.removeUser(user);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }

    @Transactional
    @Override
    public void changeUser(Long id, User user) { dao.changeUser(id, user); }

}
