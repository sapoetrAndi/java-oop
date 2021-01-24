package anonymousclass34;

public class AnonymousClass34 {
    /** 34. Anonymous Class
    # Anonymous class atau class tanpa nama.
    # Adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi object-nya secara langsung
    # Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana kita membuat anonymous class tersebut
    # Anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau abstract class sederhana, tanpa harus membuat implementasi class nya*/

    public static void main(String[] args) {
        //contoh anonymous class
        //kekurangan anonymous class tidak bisa di reuse jadi jika kita harus buat ulang
        HelloWorld english = new HelloWorld(){
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello"+ name);
            }
        };

        HelloWorld bahasa = new HelloWorld(){
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Halo"+ name);
            }
        };

        english.sayHello();
        english.sayHello("andi");

        bahasa.sayHello();
        bahasa.sayHello("Budi");
    }
}
