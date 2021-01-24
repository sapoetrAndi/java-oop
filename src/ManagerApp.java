public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("andi saputra");
        manager.sayHello("Budi");

        var vp = new VicePresident("Ronaldo");
        //vp.name = "Ronaldo";// field name diambil dari class Manager yang mewariskan ke class VicePresident
        vp.sayHello("Jack");// method sayHello() diambil dari class Manager yang mewariskan ke class VicePresident
    }
}
