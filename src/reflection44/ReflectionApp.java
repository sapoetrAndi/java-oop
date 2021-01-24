package reflection44;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("andi");//jika dikosongkan akan error karena kita memvalidasi menggunakan reflection
        request.setPassword("1234");

        ValidationUtil.validationReflection(request);
    }
}
