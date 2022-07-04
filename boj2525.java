import java.util.*;

class boj2525{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int res = sc.nextInt();

        h = h + res/60;
        m = m + res%60;
        if(m > 59){
            h++;
            m = m-60;
        }

        if(h > 23){
            h = h-24;
        }
        System.out.println(h + " " + m);
    }
}