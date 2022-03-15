package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_j_10866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] str1 = str.split(" ");


            switch (str1[0]) {
                case "push_front":

                    que.add(0,Integer.valueOf(str1[1]));

                    break;

                case "push_back":

                    que.add(Integer.valueOf(str1[1]));

                    break;

                case "pop_back":
                    if(!que.isEmpty()) {
                        int num_1 = que.remove(que.size()-1);
                        sb.append(num_1).append('\n');
                    }
                    else sb.append(-1).append('\n');

                    break;

                case "pop_front":
                    if(!que.isEmpty()) {
                        int num_1 = que.remove();
                        sb.append(num_1).append('\n');
                    }
                    else sb.append(-1).append('\n');

                    break;

                case "size":
                    sb.append(que.size()).append('\n');
                    break;

                case "empty":
                    if (que.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;

                case "front":
                    if(!que.isEmpty()) sb.append(que.peek()).append('\n');
                    else sb.append(-1).append('\n');
                    break;

                case "back":
                    if (!que.isEmpty()) {
                        for (int j = 0 ; j < que.size(); j++) {
                            if (j == que.size() - 1) {
                                int num3 = que.poll();
                                que.offer(num3);
                                sb.append(num3).append('\n');
                            } else {
                                int num2 = que.poll();
                                que.offer(num2);
                            }
                        }

                    } else sb.append(-1).append('\n');
            }
        }
        br.close();
        System.out.print(sb);
    }
}
