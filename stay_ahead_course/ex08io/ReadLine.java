package ex08io;

import java.io.*;

public class ReadLine {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("C:\\test.txt")
                )
            );
            String str;
            while ((str = in.readLine()) != null) 
                System.out.println(str);
        }
        catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
