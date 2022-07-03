package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_j_15815 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String quest = br.readLine();

        int result = 0;
        int cnt = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < quest.length(); i++){
            if(quest.charAt(i) >= '0' && quest.charAt(i) <= '9'){
                stack.push(quest.charAt(i) - '0');
            }
            else {
                if(cnt == 0){
                    int num_1 = stack.pop();
                    int num_2 = stack.pop();
                    result = operator(num_2,num_1,quest.charAt(i));
                    cnt++;
                }
                else {
                    int num = stack.pop();
                    result = operator(num,result,quest.charAt(i));
                }
//            else {
//                int num1 = stack.pop();
//                int num2 = stack.pop();
//                result = operator(num2,num1,quest.charAt(i));
//                stack.push(result);
              }

            System.out.println(result);
        }

        System.out.println(result);

    }

    public static int operator(int A, int B, char oper){

        int answer = 0;
        switch (oper){
            case '+' :
                answer = A + B;
                break;
            case '-' :
                answer = A - B;
                break;
            case '*' :
                answer = A * B;
                break;
            case '/' :
                answer = A / B;
                break;
        }
        return answer;
    }
}
