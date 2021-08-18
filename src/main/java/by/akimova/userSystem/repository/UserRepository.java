package by.akimova.userSystem.repository;

import by.akimova.userSystem.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<User, String> {

    User findByName(String name);

    void deleteById(UUID id);

    User findById(UUID id);
}

