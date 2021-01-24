package abstractmethod23;

public class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("Is implement abstract Method run from abstract class Animal");
        System.out.println("Cat "+ name + " Is Run");
    }
}
