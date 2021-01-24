package programmer.zaman.now.data;//wajib di deklarasikan ketika membuat class didalam package

public class Product {

    // modifier protected hanya bisa diakses dari package yang sama dan class turunannya
    protected String name;
    protected int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    //implementasi method toString
    //method toString yang ada di class Object bisa kita override seperti dibawah sehingga ketika kita instansiasi produk yang keluar adalah data dari produk bukan alamat pointernya
    public String toString(){
        return "Product name: "+ name + " price: "+ price;
    }

    //override equals yang ada di class object materi EqualsMethod29
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    //override hashcode yang ada di class object materi hashCode30
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
