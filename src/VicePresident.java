public class VicePresident extends Manager {
    //ini adalah child class dari class Manager
    // class ini otomatis mewarisi semua field dan method yang ada di class Manager

    // constructor vicepresident yang memanggil constructor manager menggunakan keyword super
    VicePresident(String name){
        //memanggil constructor dari class parent
        /*note: jika constructor di class parent ada dua maka kita bebas memilih salah satu dari constructor
        yang ada di class parent*/
        super(name);
    }

    //contoh implementasi Method Overriding
    //saat melakukan overriding semuanya harus sama kecuali isi dari block methodnya
    void sayHello(String name){
        //method ini meng-override/menimpa method dengan nama yang sama di class parentnya
        System.out.println("hello " + name + ", My name is VP "+ this.name);
    }

}
