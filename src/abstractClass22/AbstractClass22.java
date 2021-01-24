package abstractClass22;

public class AbstractClass22 {
    /** 22. Abstract Class
    # saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract class
    # abstract class artinya, class tersebut tidak bisa dibuat sebagai object secara langsung, hanya bisa diturunkan
    # untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci abstract sebelum kata kunci class
    # dengan demikian abstract class bisa kita gunakan sebagai kontrak (dimana sebuah class harus turunan dari abstract tersebut) untuk class child*/
    public static void main(String[] args) {
        City city = new City();
        city.name = "jakarta";//field dari class abstract yang diambil melalui objek city

        System.out.println(city.name);
    }
}
