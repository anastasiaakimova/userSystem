package by.akimova.userSystem.service;

import by.akimova.userSystem.model.User;
import by.akimova.userSystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public User saveUser(User user) {
        return repository.insert(user);
    }

    @Override
    public void updateUser(String id, User user) {
        User savedUser = repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Can't find user by id", user.getId())));

        savedUser.setName(user.getName());
        savedUser.setPassword(user.getPassword());
        savedUser.setTelephone(user.getTelephone());
        savedUser.setIsActive(user.getIsActive());

        repository.save(savedUser);
    }

    @Override
    public void deleteUserById(String id) {
        repository.deleteById(id);
    }
}
