package Algorithm;

import java.util.Scanner;

public class DateStructure01_01 {
    public static Scanner in = new Scanner(System.in);
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){


        int N = in.nextInt();
        int stack[] = new int[N];

        for (int i = (N-1); i >= 0; i--) {
            String input = in.next();

            if(input.equals("push")){
                Push(i, stack);
            }

            if(input.equals("pop")){
                Pop(N, stack);
            }

            if(input.equals("size")){
                Size(N, stack);
            }

            if(input.equals("empty")){
                Empty(N, stack);
            }

            if(input.equals("top")){
                Top(N, stack);
            }

        }
        System.out.println(sb);
    }

    public static int[] Push (int i, int stack[]){
        int num = in.nextInt();
        stack[i] = num;

        return stack;
    }

    public static void Pop(int N, int stack[]){

        for(int i = 0; i < N; i++){
            if(stack[i] != 0){
                sb.append(stack[i]).append('\n');
                stack[i] = 0;
                return;
            }
            else{
                if(i == (N-1)){
                    sb.append(-1).append('\n');
                }
            }
        }
    }

    public static void Size(int N,int stack[]){
        int cut = 0;

        for(int i = 0; i < N; i++){
            if(stack[i] != 0){
                cut++;
            }
        }
        sb.append(cut).append('\n');
    }

    public static void Empty(int N, int stack[]){

        for(int i = 0 ; i < N; i++){
            if(stack[i] == 0){
                if(i == (N-1)){
                    sb.append(1).append('\n');
                }
                else continue;
            }
            else{
                sb.append(0).append('\n');;
                return;
            }
        }
    }

    public static void Top(int N, int stack[]){

        for(int i = 0; i < N; i++){
            if( stack[i] != 0 ){
                sb.append(stack[i]).append('\n');
                return;
            }
            else{
                if(i == (N-1)){
                    sb.append(-1).append('\n');
                }
                else continue;
            }
        }
    }
}
