package Algorithm;

import java.io.*;
import java.util.Stack;

public class Baek_j_1918 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                sb.append(str.charAt(i));
            }
            else{
                if(str.charAt(i) == '(') stack.push(str.charAt(i));
                else if (str.charAt(i) == ')'){
                    while(!stack.empty() && stack.peek() != '('){
                        sb.append(stack.pop());
                    }
                    if(!stack.empty()) stack.pop();
                }
                else{ // 연산자가 나왔을 때,
                    while(!stack.empty() && precedence(stack.peek()) >= precedence(str.charAt(i))){
                        sb.append(stack.pop());
                    }
                    stack.push(str.charAt(i));

                }
            }

        }
        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
// parenthesis

    public static int precedence(char ch){
        if( ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else return 0;
    }
}