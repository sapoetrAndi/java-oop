package Encapsulation24;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("ID");
        category.setId(null);//id tidak akan berubah null karena sudah di validasi di setter methodnya


        System.out.println(category.getId());
    }
}
