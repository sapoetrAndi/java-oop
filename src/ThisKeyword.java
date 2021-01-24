public class ThisKeyword {
    /** 10. This Keyword
    # saat kita membuat kode didalam block cunstructor atau method didalam class,
      kita bisa menggunakan kata kunci this untuk mengakses object saat ini
    # misal kadang kita butuh mengakses sebuah field yang namanya sama dengan parameter method,
      hal ini tidak bisa dilakukan jika langsung menyebut nama field, kita bisa
      mengakses nama field tersebut dengan kata kunci this
    # this juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga
      bisa digunakan untuk mengakses method
    # this bisa digunakan untuk mengatasi masalah variable shadowing*/

    String name;
    String address;

    ThisKeyword(String name, String address){
        this.name = name;//untuk mengatasi variable shadowing gunakan keyword this untuk mengambil variable name diatas scope
        this.address = address;
    }
}
