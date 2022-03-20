package Algorithm;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek_j_11576 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st_1 = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st_1.nextToken());
        int B = Integer.parseInt(st_1.nextToken());

        int M = Integer.parseInt(br.readLine());

        int input[] = new int[M];
        StringTokenizer st_2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            input[i] = Integer.parseInt(st_2.nextToken());
        }

        br.close();

        int ten = 0;
        int arr[]= new int[B];
        for(int i = 0; i < B; i++){
            arr[i] = i;
        }


        for(int i = M-1, j = 0; i >= 0; i--,j++){
            ten += (input[j]*Math.pow(A,i));
        }

        while (ten >= B) {
            stack.push(ten % B);
            ten = ten / B;
        }
        stack.push(ten);


        while(!stack.empty()){
            if(stack.size() != 1) {
                sb.append(stack.pop() + " ");
            }
            else sb.append(stack.pop());
        }

        bw.write(sb + "");
        bw.flush();
        bw.close();

    }
}
