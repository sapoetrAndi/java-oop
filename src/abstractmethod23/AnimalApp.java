package abstractmethod23;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();//menggunakan implementasi polymorphism
        animal.name = "Tom";
        animal.run();
        System.out.println(animal.name);
    }
}
