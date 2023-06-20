package cat.barcelonactiva.tech4good.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Message {

    @Schema(description = "Http Status", example = "201")
    private int statusCode;

    @Schema(description = "Date and time", example = "2023-04-12T21:04:31.274+00:00")
    private LocalDateTime timestamp;

    @Schema(description = "Description message", example = "User created and added successfully into the database")
    private String textMessage;

    @Schema(description = "Uri path", example = "uri=/users/add")
    private String description;

    public Message(String textMessage) {
        this.textMessage = textMessage;
    }

}
