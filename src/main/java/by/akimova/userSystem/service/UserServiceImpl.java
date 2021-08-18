package by.akimova.userSystem.service;

import by.akimova.userSystem.model.User;
import by.akimova.userSystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        List<User> all = userRepository.findAll();
        all.removeIf(user -> !user.getIsActive());

        return all;
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User saveUser(User user) {
        user.setId(UUID.randomUUID());
        return userRepository.insert(user);
    }

    @Override
    public User updateUser(UUID id, User user) {
        User savedUser = userRepository.findById(id);
        /*
                .orElseThrow(() -> new RuntimeException(
                String.format("Can't find user by id", user.getId())));
*/
        savedUser.setName(user.getName());
        savedUser.setPassword(user.getPassword());
        savedUser.setPhone(user.getPhone());
        savedUser.setIsActive(user.getIsActive());

        return userRepository.save(savedUser);
    }

    @Override
    public void deleteUserById(UUID id) {
        userRepository.deleteById(id);
    }
}
