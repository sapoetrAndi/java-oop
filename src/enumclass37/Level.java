package enumclass37;

public enum Level {
    STANDARD("Standard Level"),//wajib memanggil parameter constructor jika kita membuat constructor
    PREMIUM("Premium Level"),
    VIP("VIP Level");//boleh tidak pakai titik koma jika tidak ada kode setelahnya

    private String desc;

    //constructor di enum tidak boleh public karena enum bukan untuk diinstansiasi
    Level(String description){
        this.desc = description;
    }

    public String getDesc(){
        return desc;
    }
}
