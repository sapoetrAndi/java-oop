package annotation43;

import java.text.Annotation;

public class Annotation43 {
    /** 43. Annotation
    # Annotation adalah menambahkan metadata ke kode program yang kita buat
    # Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat library / framework
    # Annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti
    # Untuk membuat annotation, kita bisa menggunakan kata kunci @interface
    # Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value

    * Attribute Annotation
    # Attribute                     # Keterangan
    - @Target                       - Memberitahu annotation bisa digunakan dimana? apakah di class, method, field, dll
    - @Retention                    - Memberitahu annotation apakah disimpan dihasil kompilasi, dan apakah bisa dibaca direflection?

    * Predefined Annotation
    # Java juga sudah memiliki annotation bawaan, seperti :
    # @Override, untuk menandai bahwa method yang meng-override method parent class nya
    # @Deprecated, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan
    # @FunctionalInterface, untuk menandai bahwa class tersebut bisa dibuat sebagai lambda expression
    # dan lain-lain*/


}
