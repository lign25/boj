import java.util.*;
public class boj10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String arr[][]  = new String[num][3]; //나이,이름,가입순서 3row배열
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();
            String temp[] = str.split(" ");
            arr[i][0] = temp[0]; //나이 
            arr[i][1] = temp[1]; //이름
            arr[i][2] = Integer.toString(i);  // 가입순서
        }
        Arrays.sort(arr,(a,b)-> {
            if(a[0] == b[0]) {
                return a[2].compareTo(b[2]);
            }
            else {
                return Integer.parseInt(a[0])-Integer.parseInt(b[0]);
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}