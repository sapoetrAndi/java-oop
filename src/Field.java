public class Field {
    public static void main(String[] args) {
        /*# Fields/Properties/Attributes adalah data yang bisa kita sisipkan didalam object
        # namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa saja yang
          yang dimiliki object tersebut didalam deklarasi classnya
        # membuat field sama seperti membuat variable,namun ditempatkan di block class*/

        /** 05. Manipulasi Field
        # Fields yang ada di object, bisa kita manipulasi. Tergantung final atau bukan.
        # jika final, berarti kita tidak bisa mengubah data fieldnya, namun jika tidak, kita bisa mengubah fieldnya
        # untuk manipulasi data field, sama seperti cara pada variable
        # untuk mengakses field, kita butuh kata kunci . (titik) setelah nama object dan diikuti nama fieldsnya*/

        //liat implementasi pembuatan field di class person
        // dibawah ini adalah cara memanggil field atau properties dari class person
        var person = new Person();//instansiasi dulu object personnya
        person.name = "Andi Saputra";//semua tipe data object apabila belum di deklarasikan nilainya maka nilainya akan null
        person.address = "Tangerang";
        //person.country = "final Tidak bisa di ubah";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);


    }
}
