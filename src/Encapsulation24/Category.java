package Encapsulation24;

public class Category {
    private String id;

    private boolean expensive;


    /*//getter and setter buat secara manual
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public boolean isExpensive(){
        return expensive;
    }

    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }*/

    //otomatis dibuatkan IDE
    public String getId() {
        return id;
    }

    //kita juga bisa menambahkan validasi di method setternya
    public void setId(String id) {
        //contoh validasi yang dapat kita lakukan di method setter
        //jika id-nya tidak null maka field id diisi dengan parameter id
        if(id != null){
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
