package annotation43;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE})//annotaion ini hanya bisa di gunakan di class, interface, dan enum karena elementType-nya TYPE
//khusus untuk value kita tidak wajib memanggil attributenya karena sudah default
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {
    String name();

    String[] tags() default {};// jika kita memberikan keyword default maka ketika  annotation digunakan maka tidak wajib memasukan nilainya
}
