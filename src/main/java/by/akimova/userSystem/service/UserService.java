package by.akimova.userSystem.service;

import by.akimova.userSystem.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> findAll();

    User findByName(String name);

    User saveUser(User user);

    User updateUser(UUID id, User user);

    void deleteUserById(UUID id);
}
