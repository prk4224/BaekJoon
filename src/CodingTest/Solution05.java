package CodingTest;

public class Solution05 {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean vi[] = new boolean[computers.length];

        for(boolean i : vi){
            i = false;
        }

        for(int i = 0; i < computers.length; i++){
            if(vi[i] == false){
                answer++;
                dfs(i, vi, computers);
            }
        }

        return answer;
    }
    public void dfs(int N, boolean vi[], int[][] computers){
        vi[N] = true;

        for(int i = 0; i < computers.length; i++){
            if(vi[i] == false && computers[N][i] == 1){
                dfs(i, vi, computers);
            }
        }
    }
}
