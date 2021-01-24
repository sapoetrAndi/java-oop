package tostringmethod28;

import programmer.zaman.now.data.Product;

public class ToStringMethod28 {
    /** 28. toString Method
    # toString() adalah method yang terdapat di class Object
    # method ini biasanya digunakan untuk merepresentasikan object dalam bentuk string
    # secara default, toString() ini akan menghasilkan : namaclass + @ + hashcode
    # namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca*/

    //implementasi ada di class product
    public static void main(String[] args) {
        Product product = new Product("MacBook Pro",30_000_000);

        System.out.println(product);
    }
}
