package Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class DateStructure01_04 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solve(arr));

    }
    public static String solve(int arr[]){

        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for(int i = 0; i < arr.length; i++) {

            while (true) {
                if (arr[i] > num) {
                    stack.push(num);
                    num++;
                    sb.append('+').append('\n');
                } else if (arr[i] == num) {
                    num++;
                    sb.append('+').append('\n');
                    sb.append('-').append('\n');
                    break;
                }
                else {
                    if(arr[i] == stack.peek()){
                        stack.pop();
                        sb.append('-').append('\n');
                        break;
                    }
                    else{
                        return "NO";
                    }
                }
            }
        }

        if(stack.empty()){
            return sb.toString();
        }
        else{
            return "NO";
        }
    }

}
