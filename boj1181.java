import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class boj1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));


        int a = sc.nextInt();
        String[] arr = new String[a];
        sc.nextLine();

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextLine();

        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length())
                    return o1.compareTo(o2);
                else
                    return o1.length()-o2.length();
            }

        });

        System.out.println(arr[0]);
        for(int i=1;i<a; i++) {
            if(arr[i].equals(arr[i-1])) continue;
            else { System.out.println(arr[i]);}

        }
    }
}

