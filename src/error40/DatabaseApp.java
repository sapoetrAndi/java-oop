package error40;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("andi",  "1234");
        System.out.println("sukses");
    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
