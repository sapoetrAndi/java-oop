package Encapsulation24;

public class GetterNSetter {
    /** 24. Encapsulation
    # Encapsulation artinya memastikan data yang sensitif dari sebuah objek disembunyikan dari akses luar
    # hal ini bertujuan agar kita bisa menjaga agar data sebuah objek tetap baik dan valid
    # untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private, sehingga
      tidak bisa diakses atau diubah dari luar
    # agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut

    * Getter dan Setter
    # di java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan getter dan setter method
    # getter adalah method yang dibuat untuk mengambil data field
    # setter adalah method untuk mengubah data field

    * standar pembuatan getter dan setter
    # Tipe Data         # Getter Method         # Setter Method
      - boolean           isNamaMethod()            setNamaMethod(boolean value)
      - primitif          getNamaMethod()           setNamaMethod(primitif value)
      - Object            getNamaMethod()           setNamaMethod(Object value)
      contoh:
        untuk tipe boolean -> isSuccsess(), setSuccess(parameter)
        untuk primitif -> getNilai(), setNilai(parameter)
        untuk object -> getObjectt(), setObject(parameter)*/

    /*kegunaan getter setter adalah biar tidak ada orang yang mengakses secara langsung field yang ada di objek. kita
    juga bisa menambahkan validasi di method setternya */


    //implementasi ada di class
}
