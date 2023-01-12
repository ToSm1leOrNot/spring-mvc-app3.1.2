package kz.ilyas.springmvc.springmvcapp312.Project2Boot.service;

import kz.ilyas.springmvc.springmvcapp312.Project2Boot.dao.UserDao;
import kz.ilyas.springmvc.springmvcapp312.Project2Boot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public void save (User user) {
        userDao.save (user);
    }

    @Override
    public User show (int id){
        return userDao.show (id);
    }

    @Override
    public void update(int id, User updatedUser){
        userDao.update(id , updatedUser);
    }

    @Override
    public void delete(int id){
        userDao.delete(id);
    }

}
