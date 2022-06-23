import java.util.Scanner;

public class boj11659 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[a+1];
        arr[0]=0;

        for(int i=1;i<=a;i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }
        for(int i=0;i<b;i++){

           int x = sc.nextInt();
           int y = sc.nextInt();
            System.out.println(arr[y]-arr[x-1]);
        }

    }

}
