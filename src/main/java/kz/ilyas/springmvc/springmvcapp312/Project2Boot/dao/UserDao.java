package kz.ilyas.springmvc.springmvcapp312.Project2Boot.dao;


import kz.ilyas.springmvc.springmvcapp312.Project2Boot.models.User;

import java.util.List;
public interface UserDao {

    List<User> index();
    User show (int id);
    void save (User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
