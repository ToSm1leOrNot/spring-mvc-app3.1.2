package kz.ilyas.springmvc.springmvcapp312.Project2Boot.dao;


import kz.ilyas.springmvc.springmvcapp312.Project2Boot.models.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<User> index() {
        return entityManager.createQuery("FROM User", User.class)
                .getResultList();
    }
    @Transactional(readOnly = true)
    public User show(int id) {
        return entityManager.find(User.class, id);
    }
    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }
    @Transactional
    public void update(int id, User updatedUser) {
        User userToBeUpdated = show(id);

        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setSurname(updatedUser.getSurname());
        userToBeUpdated.setAge(updatedUser.getAge());

        entityManager.merge(userToBeUpdated);

    }
    @Transactional
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
