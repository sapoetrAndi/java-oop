package statickeyword35;

public class MathUtil {
    //contoh static method
    public static int sum(int... values){
        int total = 0;
        for (var value: values) {
            total += value;
        }
        return  total;
    }
}
