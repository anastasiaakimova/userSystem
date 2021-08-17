package by.akimova.userSystem.service;

import by.akimova.userSystem.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findByName(String name);

    User saveUser(User user);

    void updateUser(String id, User user);

    void deleteUserById(String id);
}
