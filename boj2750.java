import java.util.Arrays;
import java.util.Scanner;

class boj2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int j=0; j<num; j++){
            arr[j]=sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i=0; i<num; i++) {

            System.out.println(arr[i]);

        }
    }
}