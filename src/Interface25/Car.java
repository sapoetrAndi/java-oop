package Interface25;

import InterfaceInheritance26.HasBrand;

public interface Car extends HasBrand {//car turunan dari interface hasbrand

    //method yang berada di dalam interface memiliki default public abstract
    public abstract void drive();

    int getTier();

    //default method/ concrete method. saat kita membuat default method maka semua turunan tidak wajib meng-override
    default boolean isBig(){
        return false;
    }
}
