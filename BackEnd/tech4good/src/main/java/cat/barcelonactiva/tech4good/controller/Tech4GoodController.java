package cat.barcelonactiva.tech4good.controller;

import cat.barcelonactiva.tech4good.model.dto.Message;
import cat.barcelonactiva.tech4good.model.dto.UserDTO;
import cat.barcelonactiva.tech4good.model.service.Tech4GoodService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") //TODO --> URL FRONTEND
@Tag(name = "Tech4Good API", description = "API operations pertaining to Tech4Good database")
public class Tech4GoodController {

    @Autowired
    Tech4GoodService tech4GoodService;


    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    @Operation(summary = "Create a new user", description = "Adds a new user into the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User created correctly", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = UserDTO.class))}),
            @ApiResponse(responseCode = "406", description = "User's name not valid", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Message.class))})})

    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(tech4GoodService.createUser(userDTO), HttpStatus.CREATED);
    }


    @PutMapping(value = "/update/{id}", produces = "application/json", consumes = "application/json")
    @Operation(summary = "Update a user", description = "Updates an existing user in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User updated correctly", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = UserDTO.class))}),
            @ApiResponse(responseCode = "404", description = "User not found by id", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Message.class))}),
            @ApiResponse(responseCode = "406", description = "User's name not valid", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Message.class))})})

    public ResponseEntity<UserDTO> updateUser(@Parameter(description = "The id of the user to be updated") @PathVariable ObjectId id, @RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(tech4GoodService.editUser(id, userDTO), HttpStatus.OK);
    }


    @GetMapping(value = "/{id}", produces = "application/json")
    @Operation(summary = "Get a user", description = "Returns a user stored in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User retrieved successfully", content = {@Content(mediaType = "application/json",
                    array = @ArraySchema(schema = @Schema(implementation = UserDTO.class)))}),
            @ApiResponse(responseCode = "404", description = "User not found", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Message.class))})})

    public ResponseEntity<UserDTO> getUser(@Parameter(description = "The id of the fruit to retrieve.") @PathVariable ObjectId id) {
        return new ResponseEntity<>(tech4GoodService.getUser(id), HttpStatus.OK);
    }


    @GetMapping(value = "/", produces = "application/json")
    @Operation(summary = "Get all users", description = "Returns a list with all users stored in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of users retrieved successfully", content = {@Content(mediaType = "application/json",
                    array = @ArraySchema(schema = @Schema(implementation = UserDTO.class)))}),
            @ApiResponse(responseCode = "404", description = "There are no users introduced in the database", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Message.class))})})

    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return new ResponseEntity<>(tech4GoodService.getUsers(), HttpStatus.OK);
    }


    @DeleteMapping(value = "/delete/{id}", produces = "application/json")
    @Operation(summary = "Delete a user", description = "Deletes an existing user from the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User removed successfully", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Message.class))}),
            @ApiResponse(responseCode = "404", description = "User not found", content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = Message.class))})})

    public ResponseEntity<Message> deleteUser(@Parameter(description = "The id of the user to remove") @PathVariable ObjectId id, WebRequest request) {
        tech4GoodService.removeUser(id);
        return new ResponseEntity<>(new Message(HttpStatus.OK.value(), LocalDateTime.now(), "User removed successfully", request.getDescription(false)), HttpStatus.OK);
    }

}
