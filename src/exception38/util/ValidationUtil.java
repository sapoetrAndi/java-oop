package exception38.util;

import exception38.LoginRequest;
import exception38.ValidatonException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidatonException, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException( "Username tidak boleh null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidatonException("username tidak boleh kosong");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("password tidak boleh null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidatonException("password tidak boleh kosong");
        }
    }
}
