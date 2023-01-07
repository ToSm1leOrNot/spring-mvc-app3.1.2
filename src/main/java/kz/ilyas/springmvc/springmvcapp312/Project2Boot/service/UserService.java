package kz.ilyas.springmvc.springmvcapp312.Project2Boot.service;

import kz.ilyas.springmvc.springmvcapp312.Project2Boot.models.User;

import java.util.List;
public interface UserService {
    List<User> index ();

    User show (int id);

    void save (User user);
    void update(int id, User updatedUser);

    void delete (int id);
}
