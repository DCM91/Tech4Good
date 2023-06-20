package cat.barcelonactiva.tech4good.model.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    @Schema(description = "Identifier of the user", example = "643d909f15da8348ee4805c1")
    private ObjectId id;

    @Field(name = "name")
    @Schema(description = "Name of the user", example = "Montse")
    private String name;

    @CreationTimestamp
    @Field(name = "registration_date")
    @Schema(description = "Registration date of the user", example = "2023-04-10 18:46:38.227499")
    private LocalDateTime registration;

    public User(String name) {
        this.name = name;
        this.registration = LocalDateTime.now();
    }
}
