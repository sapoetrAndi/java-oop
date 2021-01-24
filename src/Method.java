public class Method {
    public static void main(String[] args) {
        /** 06. Method
        # selain menambahkan field kita juga bisa menambahkan method kedalam object
        # caranya dengan mendeklarasikan method tersebut didalam block class
        # sama seperti method biasa, kita juga bisa menambahkan return value, parameter, dan method overloading di
          method yang ada didalam block class
        # untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama methodnya.
          sama seperti mengakses field*/

        //impelementasi method bisa di lihat di class person

        //dibawah ini adalah cara memanggil field dan method dari class Person

        Person person = new Person();
        person.name = "Andi Saputra";//semua tipe data object apabila belum di deklarasikan nilainya maka nilainya akan null

        person.sayHello("Steve Jobs");
    }
}
