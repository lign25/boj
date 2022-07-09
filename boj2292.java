import java.io.*;

public class boj2292 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Integer.parseInt(br.readLine());
        int room = 1;
        int floor = 1;
        int max = 1;

        for(;;) {
            if(num <= max) {
                System.out.println(floor);
                break;
            }
            room = (floor*6);
            floor ++;
            max = max + room;
        }
    }
}