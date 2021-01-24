public class ConstructorOverloading {
    public static void main(String[] args) {
        /** 08. Constructor Overloading
        # sama seperti di method, di constructor pun kita bisa melakukan overloading
        # kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda,
          atau jumlah parameter harus berbeda.*/



        //contoh penggunaan cunstuctor overloading
        Person person1 = new Person();



        //menggunakan object person1 dengan constructor tanpa parameter
        person1.name = "Jack";
        person1.sayHello("Budi");

        //menggunakan object person2 dengan constructor satu parameter
        var person2 = new Person("Andi");

        //menggunakan object person3 dengan constructor tiga parameter
        Person person3 = new Person("Bung", "Hatta");


        /** Memanggil Constructor lain
        # sama seperti method, constructor juga dapat memanggil constructor lain
        # hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
        # cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method,
          namun dengan kata kunci this*/
    }
}
