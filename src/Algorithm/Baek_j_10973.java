package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_10973 {
    static int input[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        if(prevPermutation()){
            for(int var : input){
                System.out.print(var + " ");
            }
        }
        else System.out.println(-1);

    }
    static boolean prevPermutation(){
        int i = input.length-1;
        while(i > 0 && input[i-1] <= input[i]){
            i--;
        }

        if(i <= 0){
            return false;
        }

        int j = input.length-1;
        while(input[i-1] <= input[j]){
            j--;
        }

        swap(i-1,j);


        j = input.length-1;
        while(i < j){
            swap(i,j);
            i++;
            j--;
        }

        return true;
    }

    static int[] swap(int i, int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;

        return input;
    }
}
