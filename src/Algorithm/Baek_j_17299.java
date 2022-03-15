package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek_j_17299 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(st.nextToken());
        String M = br.readLine();
        String strArr[] = M.split(" ");
        int arr[] = new int[N];
        int cut[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        for(int i = 0; i < N; i++){
            int cut_1 = 0;
            for(int j = 0; j < N; j++){
                if(arr[i] == arr[j]){
                    cut_1++;
                }
            }
            cut[i] = cut_1;
        }

        for(int i = 0; i < N; i++){

            while(!stack.empty() && cut[stack.peek()] < cut[i]){
                cut[stack.pop()] = cut[i];
            }
            stack.push(i);
        }

        for(int i = 0; i <N; i++){
            if(!stack.empty()){
                cut[stack.pop()] = -1;
            }
            else {

            }
        }

        for(int i : cut){
            System.out.print(i + " ");
        }

    }
}
