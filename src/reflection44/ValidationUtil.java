package reflection44;

import exception38.LoginRequest;
import exception38.ValidatonException;
import runtimeexception39.BlankException;

import java.lang.reflect.Field;

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

    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field: fields) {
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                // validated
                try {
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName()+ " is blank ");
                    }

                }catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field "+ field.getName());
                }
            }
        }
    }
}
