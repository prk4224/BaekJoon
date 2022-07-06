package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek_j_18352 {
    public static int map[][];
    public static boolean vi[];
    public static int N;
    public static ArrayList<Integer> result = new ArrayList<>();
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

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int tempA = Integer.parseInt(st.nextToken());
            int tempB = Integer.parseInt(st.nextToken());
            map[tempA][tempB] = 1;
            map[tempB][tempA] = 1;
        }

        bfs(0,target,start);
        Collections.sort(result);
        int size = result.size();
        for(int i = 0; i < size; i++){
            System.out.println(result.get(i));
        }




    }
    public static void bfs(int dep, int target, int start){

        vi[start] = true;
        Queue<Integer> que = new LinkedList<>();

        que.add(start);

        while(!que.isEmpty()){

            int newStart = que.poll();



            for(int i = 1; i <= N; i++){
                if(!vi[i] && map[newStart][i] == 1){
                    if(dep == target-1) result.add(i);
                    vi[i] = true;
                    que.add(i);
                }
            }
            dep++;
        }
    }
}
