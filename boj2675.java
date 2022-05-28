import java.util.Scanner;

public class boj2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        for(int i=0;i<input;i++) {

            int R = sc.nextInt();
            String S = sc.next();


            for(int j=0;j<S.length();j++) {
                for(int a=0;a<R;a++){
                    System.out.print(S.charAt(j));
                }
            }

            System.out.println();

        }

    }

}