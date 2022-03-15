package Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class DateStructure02_01 {
    public static StringBuilder sb = new StringBuilder();
    public static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int i =0;
        while(i < str.length()) {
            if (str.charAt(i) == '<') {
                i = solve_1(str, i);
            } else if (str.charAt(i) == ' ') {
                i = solve_2(str, i);
            } else {
                i = solve_3(str, i);
            }
        }

        System.out.print(sb);

    }

    public static int solve_1(String str, int i) {

        int j = i + 1;
        sb.append('<');
        while (true) {
            if (str.charAt(j) == '>') {
                break;
            } else {
                sb.append(str.charAt(j));
                j++;
            }
        }
        sb.append('>');

        return j + 1;
    }

    public static int solve_2(String str, int i) {

        int j = i + 1;
        sb.append(' ');

        while (true) {
            if(j >= str.length()){
                int size = stack.size();

                for (int k = 0; k < size; k++) {
                    sb.append(stack.pop());
                }
                break;
            }
            else if (str.charAt(j) == ' ' || str.charAt(j) == '<') {
                int size = stack.size();

                for (int k = 0; k < size; k++) {
                    sb.append(stack.pop());
                }

                if(str.charAt(j) == ' '){
                    sb.append(' ');
                } else{
                    j--;
                }
                break;

            } else {
                stack.push(str.charAt(j));
                j++;
            }
        }

        stack.clear();

        return j + 1;
    }

    public static int solve_3(String str, int i) {

        int j = i;
        while (true) {
            if(j >= str.length()){
                break;
            }
            else if (str.charAt(j) == '<' || str.charAt(j) == ' ') {
                break;
            }
            else {
                stack.push(str.charAt(j));
                j++;
            }
        }
        int size = stack.size();

        for (int k = 0; k < size; k++) {
            sb.append(stack.pop());
        }

        stack.clear();
        return j;
    }
}
