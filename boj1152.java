import java.io.*;
import java.io.BufferedReader;

public class boj1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String abc = str.trim();
        if(abc == ""){
            System.out.println("0");
        }
        else {
            String[] arr = abc.split(" ");
            System.out.println(String.valueOf(arr.length));
        }
    }
}
