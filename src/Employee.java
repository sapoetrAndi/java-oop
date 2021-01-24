public class Employee {
    String name;

    //constructor
    Employee(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("hello " + name + ", My name is Employee "+ this.name);
    }
}
