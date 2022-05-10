
import java.util.Scanner;

public class boj15649 { //전역변수를 선언하기 위한 클래스

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();	// 정적타입으로 해주어야한다.

    public static void main(String[] args) { // 입출력 메인 클래스, 여기에서의 변수는 전역변수로 설정된다.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
        // 마지막에 한 번에 출력
        System.out.println(sb);

    }

    public static void dfs(int N, int M, int depth) { //매개변수 설정과 동시에 전역변수로 설정
        // 재귀 깊이가 M과 같아지면 탐색과정에서 담았던 배열을 출력

        if (depth == M ) {
            for (int val : arr) { //val이 arr의 각 값으로 차례대로 설정된다.
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            // 만약 해당 노드(값)을 방문하지 않았다면?
            if (!visit[i]) {
                visit[i] = true; //해당 노드를 방문상태로 변경
                arr[depth] = i + 1; //깊이를 index로 하여 i + 1 값 저장
                dfs(N, M, depth + 1); // 다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀호출
                visit[i] = false;  // 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
            }
        }
    }

}