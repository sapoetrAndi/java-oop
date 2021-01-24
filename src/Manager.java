public class Manager extends Employee { //ini adalah parent class
    // dibawah ini adalah field/properties
    //String name;// field ini dihapus dan dipindahkan ke class employee pada materi Polymorphism
    String company;

    Manager(String name){

        //this.name = name;//diubah pada materi 16. Polymorphism

        //code diatas diganti dengan ini
        super(name);//constructor dari class Employee
    }

    Manager(String name, String company){
        //this.name = name;//diubah pada materi 16. Polymorphism
        //dan diganti dengan ini
        super(name);//constructor dari class Employee
        this.company = company;
    }

    //dibawah ini adalah method
    void sayHello(String name){
        System.out.println("hello " + name + ", My name is Manager "+ this.name);
    }
}
