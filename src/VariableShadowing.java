public class VariableShadowing {
    /** 09. Variable shadowing
    # adalah kejadian ketika kita membuat nama variable dengan nama yang sama
      di scope yang menutupi variable dengan nama yang sama discope diatasnya
      (menimpa/ menutupi variable/field discope atasnya)
    # ini biasa terjadi seperti kita membuat nama parameter di method sama dengan
      nama field di class
    # saat terjadi variable shadowing, maka secara otomatis variable di scope
      diatasnya tidak bisa diakses*/

    String name;//variable ini akan tertutup dengan variable yang ada di parameter constructor karena namanya sama
    String address;

    VariableShadowing(String name, String address){
        name = name;
        address = address;
    }

}
