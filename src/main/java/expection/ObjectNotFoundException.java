package expection;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(Class classOfObject){
        super(classOfObject.getSimpleName() + " not found");
    }

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
