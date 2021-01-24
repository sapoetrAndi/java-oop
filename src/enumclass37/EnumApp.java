package enumclass37;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("andi");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDesc());


        //konversi enum menjadi string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        //konersi string menjadi enum
        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        //cara cek isi members dari enum
        System.out.println("print level");
        for (var value: Level.values()) {
            System.out.println(value);
        }


    }
}
