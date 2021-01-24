package programmer.zaman.now.aplication;

import programmer.zaman.now.data.*;//kita bisa menggunakan bintang jika ingin mengimport semua class yang ada di dalam sebuah package
import programmer.zaman.now.data.Product;//implementasi import nama package diakhiri nama class

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook", 30_000_000);

        Data data = new Data();

        //System.out.println(product.name);// field protected name tidak dapat di access karena dikses dari package yang berbeda dan bukan turunannya
    }
}
