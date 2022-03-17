package Algorithm;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek_j_17299 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(st.nextToken());
        String M = br.readLine();
        String strArr[] = M.split(" ");
        int arr[] = new int[N];
        int cut[] = new int[N];
        int cut1[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        br.close();

        for(int i = 0; i < N; i++){
            int cut_1 = 0;
            for(int j = 0; j < N; j++){
                if(arr[i] == arr[j]){
                    cut_1++;
                }
            }
            cut[i] = cut_1;
            cut1[i] = cut_1;
        }

        for(int i = 0; i < N; i++){
            while(!stack.empty() && cut[stack.peek()] < cut[i]){
                cut[stack.pop()] = cut[i];
            }
            stack.push(i);
        }


        while(!stack.empty()){
            cut[stack.pop()] = -1;
        }

        for(int i =0; i < N; i++){
            int max = 0;
            for(int j = 0 ; j < N; j++){
                if(cut1[i] < cut1[j] && max < arr[j]){
                    cut[i] = arr[j];
                    max = arr[j];
                }
            }
        }

        for(int i : cut){
            bw.write(i + " ");
        }
        bw.close();
        return;
    }
}
// 시간 초과
