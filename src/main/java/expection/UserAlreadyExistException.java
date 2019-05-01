package expection;

public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException(Class classOfObject, String fieldName, String fieldValue){
        super(classOfObject.getSimpleName() + " with " + fieldName + " : " + fieldValue + " already exist");
    }

}
