package Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Baek_j_17298 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();

        int N = in.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < N; i++) {

            while (!stack.empty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.empty()){
            arr[stack.pop()] = -1;
        }

        for(int T : arr){
            sb.append(T).append(' ');
        }
        System.out.print(sb);
    }
}
