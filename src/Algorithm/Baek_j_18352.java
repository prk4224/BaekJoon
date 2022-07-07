package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek_j_18352 {
    public static ArrayList<ArrayList<Integer>> input = new ArrayList<>();
    public static int map[][];
    public static boolean vi[];
    public static int N;
    public static int de[];
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 도시의 수
        N = Integer.parseInt(st.nextToken());
        // 도시에 연결 수
        int M =Integer.parseInt(st.nextToken());
        // 도시까지의 거리
        int target = Integer.parseInt(st.nextToken());
        // 출발 도시
        int start = Integer.parseInt(st.nextToken());

        map = new int[N+1][N+1];
        vi = new boolean[N+1];
        de = new int[N+1];

        // 연결리스트에 노드 추가
        for(int i=0;i<=N;i++) {
            input.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int tempA = Integer.parseInt(st.nextToken());
            int tempB = Integer.parseInt(st.nextToken());
            input.get(tempA).add(tempB);
            map[tempA][tempB] = 1;
            map[tempB][tempA] = 1;
        }

        bfs(target,start);

        for(int i = 1; i <= N; i++){
            if(de[i] == target) {
                System.out.println(i);
            }
        }



    }
    public static void bfs(int target, int start){

        vi[start] = true;
        Queue<Integer> que = new LinkedList<>();

        que.add(start);

        while(!que.isEmpty()){
            int newStart = que.poll();


            for(int i = 1; i <= N; i++){
                if(!vi[i] && map[newStart][i] == 1){

                    de[i] = de[newStart]+1;
                    vi[i] = true;

                    que.add(i);
                }
            }
        }
    }
}
