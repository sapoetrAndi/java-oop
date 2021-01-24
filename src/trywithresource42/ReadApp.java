package trywithresource42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {

        //cara manual membaca file
        /*BufferedReader reader = null;

        try{
            reader = new BufferedReader(
                    new FileReader("README.md")
            );

            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable throwable){
            System.out.println("error membaca file "+ throwable.getMessage());
        }finally {
            if(reader != null){
                try {
                    reader.close();
                    System.out.println("sukses menutup");
                }catch (IOException exception){
                    System.out.println("error menutup resource "+ exception.getMessage());
                }
            }
        }*/

        //cara membaca file menggunakan try with resource
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable throwable){
            System.out.println("error membaca file "+ throwable.getMessage());
        }
    }
}
