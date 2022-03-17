package Algorithm;

import java.io.*;
import java.util.Stack;

public class Baek_j_17299_result {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");

        int result[] = new int[N];
        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int num_count[] = new int[1000001];
        for(int i = 0; i < N; i++){
            num_count[arr[i]]++;
        }

        for(int i =0; i <N; i++){
            if(stack.empty()) stack.push(i);

            while(!stack.empty() && num_count[arr[stack.peek()]] < num_count[arr[i]]){
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.empty()){
            result[stack.pop()] = -1;
        }

        for(int i : result){
            bw.write(i + " ");
        }
        bw.close();
        return;
    }
}
