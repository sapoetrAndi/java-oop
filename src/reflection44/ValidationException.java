package reflection44;

public class ValidationException extends Throwable {

    /*//apabila kita buat exception sendiri
    private String message;

    public ValidationException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }*/

    //override dari superclass
    public ValidationException(String message){
        super(message);
    }
}
