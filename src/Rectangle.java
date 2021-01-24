public class Rectangle extends Shape {
    // method ini meng-override method getCorner yang berada di class shape
    int getCorner(){
        return 4;
    }

    /*membuat method untuk mengakses method get corner yang berada di class Shape yang sudah di
    override*/
    int getParentCorner(){
        // penggunaan katakunci super untuk memanggil method getCorner yang sudah di override dari class parentnya
        return super.getCorner();
    }
}
