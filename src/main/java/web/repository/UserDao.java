package web.repository;

import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void addUser(User user) {
        entityManager.persist(user);
    }
}
