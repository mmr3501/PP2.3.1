package web.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Component
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    @Autowired
    private EntityManager em;

    @Autowired
    public UserDaoImpl() {
    }

    @Override
    public void saveUser(User user) {
        em.merge(user);
    }

    @Override
    public void removeUserById(Long id) {
        User user = getUserById(id);
        em.remove(user);
    }

    @Override
    public void removeUser(User user) {
        em.remove(user);
    }

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User getUserById(Long id) {
        TypedQuery <User> query = em.createQuery("FROM User WHERE id = :id", User.class).setParameter("id", id);
        return query.getSingleResult();
    }
}

