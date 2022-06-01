import java.util.Scanner;

public class boj1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counting = new int[10];
        int num = sc.nextInt();


        //자릿수대로 잘라서 배열에 넣기
        while(num!=0) {
            counting[num%10]++;
            num /=10;

        }
        for(int i=9; i>=0; i--){
            while(counting[i]-- > 0){
                System.out.print(i);
            }
        }


    }
}
