import java.util.Scanner;

public class boj2559 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 입력할 일 수
        int b = sc.nextInt(); // 비교할 일 수
        int arr[] = new int[a];
        int Max = -2147483648;  //가장 작은 값 지정
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<=a-b;i++){
            int sum=0;
            for(int j=i;j<i+b;j++){
                sum += arr[j];

            }
            Max = Math.max(Max, sum);
        }
        System.out.println(Max);
    }
}
