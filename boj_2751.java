import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0; j<num; j++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
        

    }
}
