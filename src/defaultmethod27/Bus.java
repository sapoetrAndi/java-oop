package defaultmethod27;

import Interface25.Car;

public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Bus");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    //override dari default method di interface car
    @Override
    public boolean isBig() {
        return true;
    }
}
