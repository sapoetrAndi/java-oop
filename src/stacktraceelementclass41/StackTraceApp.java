package stacktraceelementclass41;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names = {
                    "andi", "saputra"
            };
            System.out.println(names[100]);
        }catch (Throwable throwable){
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }

    //multiple stacktrace
    public static void sampleError(){
        try {
            String[] names = {
                    "andi", "saputra"
            };
            System.out.println(names[100]);
        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
