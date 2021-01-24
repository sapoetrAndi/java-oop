package statickeyword35;

public class Application {
    public static final int PROCESSOR;

    //contoh static block
    static {
        //static block akan dieksekusi sekali sebelum class ini diload
        System.out.println("Mengakses class Application");

        //distatic block kita bisa menambahkan kode kedalam sebuah variabel
        PROCESSOR = Runtime.getRuntime().availableProcessors();//kode ini untuk mengambil jumlah proccessor yang ada di laptop
    }
}
