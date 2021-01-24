public class VariabelHiding18 {
    /** 18. Variable Hiding
    # Variable hiding merupakan masalah yang terjadi ketika kita membuat nama field yang sama diclass child dengan
      diclass parent.
    # tidak ada yang namanya field overriding, ketika kita buat ulang nama field di class class, itu berarti variable
      hiding.
    # untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword
    # yang membedakan variable hiding dengan method overriding adalah ketika sebuah object di casts/konversi
    # saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses variable
      yang ada di classnya*/

    //tidak disarankan membuat variable yang sama dengan parent di turunan karena berpotensi variable hiding
    //implementasi variable hiding ada di class parent, child, parentapp

}
