package exception38;

import exception38.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest =  new LoginRequest(null, null);

        //error karena function exception harus di panggil menggunakan try catch
        //ValidationUtil.validate(loginRequest);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidatonException exception){
            System.out.println("Data tidak valid : "+ exception.getMessage());
        }catch (NullPointerException exception){
            System.out.println("Data Null   : "+ exception.getMessage());
        }

        //multiple trycatch jika isi block catch-nya sama
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidatonException | NullPointerException exception){
            System.out.println("Data tidak valid : "+ exception.getMessage());
        }


        //finaly block
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidatonException exception){
            System.out.println("Data tidak valid : "+ exception.getMessage());
        }finally{
            System.out.println("error atau pun tidak akan tetap di eksekusi");
            //contohnya untuk menutup koneksi agar tidak menggantung di memori
        }
    }
}
