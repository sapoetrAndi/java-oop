package recordclass36;

public class RecordClass36 {
    /** 36. Record Class
    # Fitur ini masih versi preview dan belum stabil di versi Java 14, namun kita sudah bisa mencobanya
    # Tapi perlu diingat, bahwa karena fitur ini masih experimental, artinya tidak ada jaminan di versi
      Java mendatang, fitur ini akan tetap ada, bisa saja dihilangkan

    # Kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter, equals, hashCode, dan toString method
    # Record class digunakan untuk mempermudah pembuatan jenis class tersebut
    # Saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode dan toString method secara otomatis, dan juga constructor secara otomatis
    # Saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record, yang artinya kita tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface

    * Record Class Constructor
    # Secara default, constructor di record class akan dibuat secara otomatis, sesuai dengan definisi record class parameter
    # Namun jika kita ingin melakukan sesuatu di constructor tersebut, kita bisa membuat compact constructor, yaitu constructor tanpa tanda ()
    # Selain itu, kita juga bisa melakukan constructor overloading, namun ada syaratnya, yaitu constructor overloading nya harus tetap memanggil constructor utama yang secara otomatis dibuatkan di record class*/

    //implementasi ada di record loginrequest dan class recordapp


}
