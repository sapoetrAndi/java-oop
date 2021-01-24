public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Eko";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        //method ini akan diambil dari kelas child karena overriding meskipun sudah di casts ke tipe parent
        parent.doIt();
        /*sedangkan field ini akan diambil dari kelas parentnya karena
        di java tidak ada field overriding yang ada adalah variable hiding*/
        System.out.println(parent.name);
    }

}
