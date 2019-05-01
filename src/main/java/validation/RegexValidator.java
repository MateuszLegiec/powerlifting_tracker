package validation;


import java.util.regex.Pattern;

class RegexValidator {

    private static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,}$");

    private static final Pattern VALID_USERNAME_REGEX = Pattern.compile("^[a-zA-Z0-9._-]{4,16}$");


    static boolean passwordValidation(String str){
        return VALID_PASSWORD_REGEX.matcher(str).find();
    }

    static boolean usernameValidation(String str){ return VALID_USERNAME_REGEX.matcher(str).find(); }

}
