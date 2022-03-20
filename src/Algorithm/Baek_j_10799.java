package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_j_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        br.close();
        char[] ch = new char[str.length()];

        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
        }

        int cut = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] =='(' && ch[i+1] ==')'){
                cut += stack.size();
                i += 1;
            }
            else if(ch[i] == '('){
                stack.push(ch[i]);
            }
            else {
                cut++;
                stack.pop();
            }
        }


        System.out.print(cut);

    }
}
