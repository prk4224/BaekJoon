package Algorithm;

import java.io.*;
import java.util.*;

public class Baek_j_1107 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine()); // 고장 갯수
        boolean bd[] = new boolean[10];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(st.nextToken());
            bd[M] = true;
        }


        int result = Math.abs(target - 100); // +,-로만 이동 가능한 횟수로 초기화
        for (int i = 0; i <= 999_999; i++) {
            String str = String.valueOf(i);
            int leng = str.length();

            boolean isBreak = false;
            // i에 고장난 버튼이 있는지 판별
            for (int j = 0; j < leng; j++) {
                if (bd[str.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }

            //고장난 버튼이 없을 경우
            if (!isBreak) {
                int min = Math.abs(target - i) + leng;
                result = Math.min(min, result);
            }
        }
        System.out.print(result);
    }
}
// BufferedReader를 쓰면 런타임 에러 Scanner을 쓰면 통과 ?
