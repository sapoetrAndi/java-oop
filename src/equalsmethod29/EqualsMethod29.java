package equalsmethod29;

import programmer.zaman.now.data.Product;

public class EqualsMethod29 {
    /** 29. EqualsMethod29
     # Hal yang agak membingungkan di Java adalah, cara membandingkan object
     # Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator ==, di Java, operator == hanya untuk mengecek data primitif
     # Untuk non primitif pengecekan nya menggunakan method equals
     # Dan secara default, method equals itu akan membandingkan dua buah object secara kesamaan posisi object di memory, artinya jika kita membuat 2 object yang isi fields nya sama, tetap dianggap beda oleh method equals
     # Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut
     */

    public static void main(String[] args) {
        String first ="andi";
        first = first+ " " + "saputra";
        System.out.println(first);

        String second = "andi saputra";
        System.out.println(second);

        String third = "andi saputra";

        //false karena di java kita tidak bisa membandingkan object dengan (==). operator == hanya untuk membandinkan tipe data primitif
        // jika kita menggunakan (==) yang dibandingkan adalah lokasi memorynya
        System.out.println(first == second);

        //untuk membandingkan object dijava kita memakai equals()
        //jika kita menggunakan equals() yang dibandingkan object dan isinya
        System.out.println(first.equals(second));

        //namun apabila isi string nya sama persis maka java tidak akan membuat ulang data string di memory(dioptimize)
        System.out.println(second == third);

        Product product = new Product("MacBook", 30_000_000);
        Product product2 = new Product("MacBook", 30_000_000);

        //disarankan apa bila kita membuat class ada baiknya kita mengoverride method equals() agar kita bisa membandingkan isinya
        //override ada di class Product

        System.out.println("cek "+product.equals(product));

    }
}
