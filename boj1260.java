import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1260 {
    static int map[][];
    static boolean[] visit;
    static int n,m,v;

    public static void dfs(int i){   //i는 방문할 방의 이름
        visit[i] = true;  //방문원이 방문했으면 방문원이 수첩에 체크함
        System.out.print(i+" ");  //방문했으니, 방 이름을 알려준다!
        for(int j =1; j<n+1; j++){
            if(map[i][j] == 1 && visit[j]==false){ //map=1이면 방이 아직 정리 안된거, 동시에 방문원이 온적도 없는거면 바로 정리정돈 실시.
                dfs(j);
            }
        }


    }


    public static void bfs(int i){
        Queue<Integer> q = new LinkedList<Integer>(); //레고 블록틀을 생성!
        q.offer(i); //출발하는 방의 이름이 적힌 블록을 블록틀에 꽂기!
        visit[i] = true; //블록을 꽂았으니까, 방문원이 블록 꽂았다고 체크
        //위에 두 줄은 밑의 for문 내용을 똑같이 따라하는거임. 먼저 처리하고 출발해야하니까.
        while(!q.isEmpty()){ //블록틀을 꽉채울때까지 퇴근못함!
            int temp = q.poll();
            //방금 꽂은 블록은 처리완료 처리. 이제 볼일 없음.
            System.out.print(temp+" ");
            //처리했으니 알려줌.
            for(int k =1; k<=n; k++){
                if(map[temp][k]==1 && visit[k]==false){ //방금 처리한 블록과 다른 블록에 적힌 방이 서로 처리된적 없고, 새로운 방이 초기화 상태면.
                    q.offer(k); //새로운 방 이름을 블록틀에 꽂아준다.
                    visit[k] = true; //블록 처리했다고 적기!
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        map =new int[n+1][n+1];  //어떤방끼리 연결돼있는지 설계할거니까 2차원 배열
        visit = new boolean[n+1]; //방문원을 생성함
        for(int j=0; j<n+1;j++){
            Arrays.fill(map[j], 0);  //방을 깨끗이 청소해놔야하니까 0으로 초기화
        }
        Arrays.fill(visit, false); // 방문원의 복장도 청소해야하니, 깔끔하게 초기화
        for(int i=0; i<m; i++){
            String edge = br.readLine();
            StringTokenizer st1 = new StringTokenizer(edge," ");
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            map[a][b]=1;
            map[b][a]=1; //연결돼있는방은 양방향 통행이 가능해야하니까 두가지 방향의 값을 똑같이 설정
        }
        dfs(v);
        System.out.println();
        Arrays.fill(visit, false);
        bfs(v);
    }
}