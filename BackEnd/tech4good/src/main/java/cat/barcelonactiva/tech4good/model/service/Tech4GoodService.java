package cat.barcelonactiva.tech4good.model.service;

import cat.barcelonactiva.tech4good.model.domain.User;
import cat.barcelonactiva.tech4good.model.dto.UserDTO;
import cat.barcelonactiva.tech4good.model.exception.UserDuplicatedException;
import cat.barcelonactiva.tech4good.model.exception.UserNotFoundException;
import cat.barcelonactiva.tech4good.model.repository.IUserRepository;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class Tech4GoodService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IUserRepository userRepository;

    /**
     * Service method to create a user in the database. Used in the controller layer.
     * @param userDTO
     * @return userDTO
     */
    public UserDTO createUser(UserDTO userDTO) {
        UserDTO userValidated = validateUserName(userDTO);
        User newUser = new User(userValidated.getName());
        User userSaved = userRepository.save(newUser);
        return convertUserToDTO(userSaved);
    }

    /**
     * Service method to update a user in the database. Used in the controller layer.
     * @param id
     * @param userDTO
     * @return userDTO
     */
    public UserDTO editUser(ObjectId id, UserDTO userDTO) {
        User userToUpdate = getUserById(id);

        UserDTO userValidated = validateUserName(userDTO);
        userToUpdate.setName(userValidated.getName());
        userRepository.save(userToUpdate);
        return convertUserToDTO(userToUpdate);
    }

    //TODO --> Mètode que actualment no es fa servir.
    /**
     * Es modifiquen tots els atributs del user directament amb el BeanUtils.copyProperties.
     */
    public UserDTO editUser2(ObjectId id, UserDTO userDTO) {
        User userToUpdate = getUserById(id);

        BeanUtils.copyProperties(userDTO, userToUpdate);
        User userUpdated = userRepository.save(userToUpdate);
        return convertUserToDTO(userUpdated);
    }

    /**
     * Service method to get a user from the repository. Used in the controller layer.
     * @return userDTO
     */
    public UserDTO getUser(ObjectId id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()) {
            User userFromDB = userOptional.get();
            return convertUserToDTO(userFromDB);
        } else {
            throw new UserNotFoundException("User not found");
        }
    }

    /**
     * Service method to get all users from the repository. Used in the controller layer.
     * @return usersDTO
     */
    public List<UserDTO> getUsers() {
        if (userRepository.findAll().isEmpty()) {
            throw new UserNotFoundException("There are no users introduced yet");
        } else {
            List<User> users = userRepository.findAll();
            return convertUserListToDTO(users);
        }
    }

    /**
     * Service method to delete a user from the repository. Used in the controller layer.
     * @param id
     */
    public void removeUser(ObjectId id) {
        User userById = getUserById(id);
        userRepository.delete(userById);
    }

    /**
     * Private method to get a user from the repository by its id. Used in editUser() and removeUser() methods.
     * @param id
     * @return user
     */
    private User getUserById(ObjectId id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()) {
            return userOptional.get();
        } else {
            throw new UserNotFoundException("User not found");
        }
    }

    /**
     * Private method to validate if user's name is unique. It's used in createUser() and editUser() methods.
     * @param userDTO
     * @return userDTO
     */
    private UserDTO validateUserName(UserDTO userDTO) {
        if(userRepository.existsByName(userDTO.getName())) {
            throw new UserDuplicatedException("User's name must be unique");
        } else {
            return userDTO;
        }
    }

    /**
     * Private method to convert a user to a userDTO.
     * @param user
     * @return userDTO
     */
    private UserDTO convertUserToDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    /**
     * Private method to convert a list of users to a list of usersDTO.
     * @param users
     * @return usersDTO
     */
    private List<UserDTO> convertUserListToDTO(List<User> users) {
        return users.stream().map(this::convertUserToDTO).collect(Collectors.toList());
    }

}
