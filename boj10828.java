import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Stack;

public class boj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            if (input[0].equals("push")) {
                int pushNum = Integer.parseInt(input[1]);
                stack.push(pushNum);
            }
            else if (input[0].equals("size")) {
                    bw.write(stack.size()+"\n");
            }
             else if (input[0].equals("pop")) {
                if (!stack.isEmpty()) {
                    bw.write(stack.pop()+"\n");
                } else
                    bw.write(-1+"\n");
            }

            else if (input[0].equals("empty")) {
                if (stack.isEmpty()) {
                    bw.write(1+"\n");
                } else
                    bw.write(0+"\n");
            }

            else if (input[0].equals("top")) {
                if (!stack.isEmpty())
                    bw.write(stack.peek()+"\n");
                else
                    bw.write(-1+"\n");
            }

        }
        bw.flush();
        br.close();
        bw.close();

    }
}




