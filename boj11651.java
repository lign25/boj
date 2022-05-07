import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj11651 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //첫 숫자만큼 줄갯수 정하기
        int n = Integer.parseInt(br.readLine());

        //n개의 줄만큼 2개 숫자 입력 배열 선언
        int [][] xy = new int [n][2];


        //입력된 문자를 토큰화하여 x,y배열에 저장
        for(int i=0 ; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xy[i][1] = x;
            xy[i][0] = y;
        }

        //xy토큰을 비교하여 같으면 다음 인덱스, 다르면 해당 인덱스 반환
        Arrays.sort(xy,new Comparator<int[]>(){
            public int compare(int[]o1, int[]o2) {
                if(o1[0]==o2[0])
                    return o1[1]-o2[1];
                else
                    return o1[0]-o2[0];
            }
        });


        //배열에 저장된 내용 출력
        for(int[] list : xy) {
            bw.write(list[1]+" "+list[0]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}