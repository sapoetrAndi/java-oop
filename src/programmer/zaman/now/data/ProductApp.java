package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 25000000);

        System.out.println(product.name);// kita bisa mengakses field protected yang ada di class product karena berada dalam satu package
        System.out.println(product.price);
    }
}
