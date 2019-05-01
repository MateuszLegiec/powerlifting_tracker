package mapper;

import domain.User;
import dto.UserDTO;

public class UserMapper implements MapperInterface<User, UserDTO> {

    @Override
    public User dtoToEntity(UserDTO userDTO) {
        return User.builder()
                .id(userDTO.getId())
                .password(userDTO.getPassword())
                .username(userDTO.getUsername())
                .gender(userDTO.getGender())
                .bodyWeight(Double.valueOf(userDTO.getBodyWeight()))
                .build();
    }

    @Override
    public UserDTO entityToDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .password(user.getPassword())
                .username(user.getUsername())
                .gender(user.getGender())
                .bodyWeight(String.valueOf(user.getBodyWeight()))
                .build();
    }
}
