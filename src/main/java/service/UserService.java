package service;

import domain.User;
import dto.UserDTO;

public interface UserService {

    User findUserById(Long id);
    UserDTO findUserByUsername(String username);
    void save(UserDTO userDTO);
    void update(UserDTO userDTO);

}
