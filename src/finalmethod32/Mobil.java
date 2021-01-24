package finalmethod32;

public class Mobil {
    //method final tiak bisa di override
    final void drive(){
        System.out.println("drive");
    }
}

class Xenia extends Mobil{
    //error karena drive adalah method final
    /*final void drive(){

    }*/
}