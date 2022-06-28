import java.util.Scanner;

public class boj2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        int maxNum = sc.nextInt();
        int[] card = new int[check];

        for(int i=0;i<check;i++){
            card[i] = sc.nextInt();
        }

        int max=0;
        for(int i=0;i<check-2;i++){
            for(int j=i+1;j<check-1;j++){
                for(int k=j+1;k<check;k++) {
                    int sum = card[i] + card[j] + card[k];

                    if (sum <= maxNum) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.println(max);
    }

}
