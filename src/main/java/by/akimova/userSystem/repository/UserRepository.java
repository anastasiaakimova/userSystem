package by.akimova.userSystem.repository;

import by.akimova.userSystem.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByName(String name);
}
