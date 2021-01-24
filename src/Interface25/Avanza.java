package Interface25;

import InterfaceInheritance26.IsMaintenance;

public class Avanza implements Car, IsMaintenance {//kita bisa meng-implements lebih dari satu interface

    //saat kita meng-implements sebuah interface semua mehod yang ada di interface wajib kita override
    @Override
    public void drive() {
        System.out.println("Drive Avanza");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        //method dari interface hasbrand parent dari interface Car yang wajib di deklarasikan juga
        return "Toyota";
    }
    public void coba(){

    }
    @Override
    public boolean isMaintenance() {
        return false;
    }
}
