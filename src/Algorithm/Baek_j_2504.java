package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_j_2504 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String input = br.readLine();
        int result = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '(' || input.charAt(i) == '['){
                stack.push(input.charAt(i));
            }
            else if(input.charAt(i) == ')'){

                if(stack.empty()) {
                    System.out.println(0);
                    return;
                }

                while (true){
                    char ch = stack.pop();

                    if(ch == '(')
                }

            }
        }

    }
}
