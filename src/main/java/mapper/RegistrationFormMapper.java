package mapper;


import dto.UserDTO;
import request.RegistrationForm;

public interface RegistrationFormMapper {

     static UserDTO registrationFormToUserDTO(RegistrationForm form){
        return UserDTO.builder()
                .username(form.getUsername())
                .gender(form.getGender())
                .password(form.getPassword())
                .bodyWeight(form.getBodyWeight())
                .build();
    }

}
