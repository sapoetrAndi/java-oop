package statickeyword35;

//cara meng-import static import
//import static statickeyword35.Constant.*;
//import static statickeyword35.Application.PROCESSORS;

public class StaticKeyword35 {
    /** 35. Static Keyword
    # Sebelumnya kita sudah sering melihat kata kunci static, namun belum pernah kita bahas
    # Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses langsung tanpa melalui object nya
    # Perlu diingat, static hanya bisa mengakses static lainnya

    * Static Dapat Digunakan di
    # Field, atau disebut class variable, artinya field tersebut bisa diakses langsung tanpa membuat object terlebih dahulu
    # Method, atau disebut class method, artinya method tersebut bisa diakses langsung tanpa membuat object terlebih dahulu
    # Block, static block akan otomatis dieksekusi ketika sebuah class di load
    # Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object outer class  terlebih
      dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi object outer class nya*/


    public static void main(String[] args) {
        //cara memanggil static member

        //panggil nama class kemudian nama fieldnya
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        //JIKA kita menggunakan static import kita bisa langusg panggil nama field-nya
        //System.out.println(APPLICATION);
        //System.out.println(VERSION);


        //panggil nama class kmeudian nama method
        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        //panggil nama outer class kemudian nama static inner class
        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        //panggil nama class kemudian nama static field yang ada di block static
        System.out.println(Application.PROCESSOR);

        //JIKA kita menggunakan static import kita bisa langusg panggil nama method-nya
        //System.out.println(PROCESSOR);

    }
}
