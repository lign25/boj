import java.util.Scanner;

public class boj10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibo(a));

    }
    public static int fibo(int n){
        if(n<=1)
            return n;
        else
            return  fibo(n-2) + fibo(n-1);
    }
}
