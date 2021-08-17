package by.akimova.userSystem.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author anastasiyaakimava
 */

@Document(collection = "users")
@Data
public class User {

    @Field(name = "id")
    @Indexed(unique = true)
    private String id;
    @Field(name = "name")
    private String name;
    @Field(name = "password")
    private String password;
    @Field(name = "telephone")
    private String telephone;
    @Field(name = "isActive")
    private Boolean isActive;

}
