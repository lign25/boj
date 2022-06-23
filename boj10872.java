import java.util.Scanner;


public class boj10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int AddInt = 1;
        for(int i=2;i<=input;i++){
            AddInt = AddInt * i;
        }
        System.out.println(AddInt);
    }
}
