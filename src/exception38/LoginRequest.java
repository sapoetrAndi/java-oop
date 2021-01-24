package exception38;
public record LoginRequest(String username, String password) {//constructor langsung dibuat di parameter


    //jika kita ingin menambahkan kode kedalam constructor didalam record class kita bisa buat tanpa menggunakan kurung buka & tutup
    public LoginRequest{
        System.out.println("Membuat Object LoginRequest");
    }

    //constructor overloading di Record class
    public LoginRequest(String username){
        this(username, "");
    }


    //constructor overloading di Record class
    public LoginRequest(){
        this("","");
    }
}


