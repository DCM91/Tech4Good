package cat.barcelonactiva.tech4good.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @Schema(description = "Identifier of the user", example = "643d909f15da8348ee4805c1")
    private ObjectId id;

    @Schema(description = "Name of the user", example = "Montse")
    private String name;

    @Schema(description = "Registration date of the user", example = "2023-04-10 18:46:38.227499")
    private LocalDateTime registration;

}
