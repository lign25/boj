import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10815 {
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int b = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] answer = new int[b];
        for(int i=0;i<b;i++){
            int num = Integer.parseInt(st.nextToken());
            answer[i] = BinarySearch(num);
            System.out.print(answer[i]+" ");
        }

    }

    private static int BinarySearch(int T){
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left <= right){
            mid = (left + right) / 2;
            if(arr[mid]<T)
                left = mid+1;
            else if(arr[mid]>T){
                right = mid-1;
            }
            else
                return 1;
        }
        return 0;
    }

}


