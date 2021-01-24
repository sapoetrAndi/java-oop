public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("putra");
        employee.sayHello("Budi");

        employee = new Manager("Daniel");
        employee.sayHello("Budi");

        employee = new VicePresident("Bryan");
        employee.sayHello("Budi");

        /*code diatas adalah contoh penerapan Polymorphism dimana sebuah object dapat berubah bentuk ke
        bentuk yang lain dari class class turunannya. seperti objek employee yang bertipe data Employee dan
        di instansiasi menjadi new Employee() di awal tapi kemudian kita dapat merubah bentuknya dengan cara
        menginstansiasi menjadi new Manager() dan new VicePresident() sehingga ketika kita memanggil method
        sayHello() maka yang dipanggil adalah method yang ada di masing masing object*/

        //jadi polymorphism erat kaitannya sama pewarisan


        //kita dapat memanggil fungsi sayHello dengan cara ini
        sayHello(new Employee("nathan"));
        sayHello(new Manager("abdu"));
        sayHello(new VicePresident("andi"));

    }

    // parameter pada method dibawah ini adalah class yang paling atas/parent
    static void sayHello(Employee employee){
        //sebelum melakukan casts pastikan kita melakukan type check terlebih dahulu agar aman
        if (employee instanceof VicePresident){
            // cara casts/konversi tipe data yang bukan primitif
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+ vicePresident.name);
        }else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+ manager.name);
        }else{
            System.out.println("Hello "+ employee.name);
        }
    }
}
