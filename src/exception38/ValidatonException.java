package exception38;

public class ValidatonException extends Throwable {

    /*//apabila kita buat exception sendiri
    private String message;

    public ValidationException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }*/

    //override dari superclass
    public ValidatonException(String message){
        super(message);
    }
}
