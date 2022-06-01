import java.util.Scanner;

public class boj1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); //대상 문자열
        str = str.toUpperCase(); //대문자로 치환
        int arr[] = new int[26];

        for(int i=0;i<str.length();i++) {

            if(65 <= str.charAt(i) && str.charAt(i) <= 90) { // 대문자 범위
                arr[str.charAt(i) - 65]++;
            }
        }

        //배열 돌면서 가장 높은 인덱스 출력
        int max = -1;
        char T = '?';
        for(int i=0;i< arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
                T = (char) (i+65);
            }
            else if(arr[i]==max){
                T='?';
            }
        }
        System.out.println(T);

    }
}

