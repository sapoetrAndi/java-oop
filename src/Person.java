public class Person {

    //ini adalah contoh field/property
    String name;
    String address;
    //ini adalah final field/property
    final String country = "Indonesia";

    //ini adalah contoh constructor dari class Person
    Person(){
        //memanggil constructor Person yang memiliki parameter satu
        this(null);
    }
    //contoh constructor dengan parameter
    Person(String paramName){
        //memanggil constructor lain dengan keyword this. dalam hal ini memanggil constructor Person dengan 2 parameter
        this(paramName, null);
    }

    //contoh meng-overloading/menimpa cunstructor
    Person(String paramName, String paramAddress){
        //jika sebuah constructor memiliki parameter, kita wajib memasukan nilai parameter pada saat instansiasi object
        name = paramName;
        address = paramAddress;
    }


    //ini adalah contoh method
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + " My name is "+ name);
    }
}
