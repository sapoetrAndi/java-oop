package innerclass33;

public class innerclass33 {
    /** 33. inner class
    # Di Java, kita bisa membuat class di dalam class, atau disebut dengan Inner Class
    # Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain
    # Misal kita perlu membuat class Employee, dimana membutuhkan class Company, maka kita bisa membuat class Employee sebagai inner class Company
    # Cara membuat inner class, cukup membuatnya di dalam blok class outer class nya(simpan didalam block class yg dinginkan)

    * Mengakses Outer Class
    # Keuntungan saat kita membuat inner class adalah, kemampuan untuk mengakses outer class nya
    # Inner class bisa membaca semua private member yang ada di outer class nya
    # Untuk mengakses object outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan kata kunci this, misal Company.this
    # Dan untuk mengakses super class outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan kata kunci super, misal Company.super*/

    //implementasi ada di class company
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Outer class");
        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        //Company.Employee employee = company.new Employee();
        employee.setName("inner class");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());


        Company company2 = new Company();
        company2.setName("PT. OOP-Java");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("andi saputra");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
