package Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class DateStructure01_03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        for(int i = 0; i < N; i++) {
            String str = in.next();

            System.out.println(solve(str));

        }
    }
    public static String solve(String str){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i <str.length(); i++){

            char c = str.charAt(i);

            if(c == '('){
                stack.push(c);
            }
            else if(stack.empty()){
                return" NO";
            }
            else{
                stack.pop();
            }
        }

        if(stack.empty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
