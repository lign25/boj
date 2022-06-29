import java.util.Scanner;

public class boj2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=flip(sc.nextInt());
        int b=flip(sc.nextInt());
        System.out.println(Math.max(a,b));

    }
    public static int flip(int input){
        int result = 0;
        while(input!=0) {
            result = result * 10 + input % 10;
            input /= 10;
        }
        return result;
    }
}


