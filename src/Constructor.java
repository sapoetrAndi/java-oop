public class Constructor {
    public static void main(String[] args) {
        /** 07. Constructor
        # saat kita membuat object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung()
        # di dalam class java, kita bisa membuat class constructor, constructor adalah method yang akan dipanggil
          saat pertama kali object dibuat.
        # mirip seperti di method, kita bisa memberi parameter pada constructor
        # nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value
        #jika sebuah constructor memiliki parameter, kita wajib memasukan nilai parameter pada saat instansiasi object*/

        /** Memanggil Constructor lain
         # sama seperti method, constructor juga dapat memanggil constructor lain
         # hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
         # cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method,
         namun dengan kata kunci this*/

        // implementasi pembuatan constructor dapat dilihat pada class Person

        //contoh object yang mengirimkan nilai parameter kedalam constructor
        Person person = new Person("Andi Saputra", "Tangerang");
        person.sayHello("Bill Gates");
    }
}
