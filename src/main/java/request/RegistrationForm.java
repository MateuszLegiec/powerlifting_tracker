package request;

import domain.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Getter
@AllArgsConstructor
@Builder
public class RegistrationForm {

    private String username;
    private String password;
    private String repeatedPassword;
    private String bodyWeight;
    private Gender gender;

}
