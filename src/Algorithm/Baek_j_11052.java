package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_11052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[N];

        for(int i =0; i < N; i++ ){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int cut = 0;

        double oneVal[] = new double[N]; // 1장당 가격

        for(int i = 0; i < N; i++){
            oneVal[i] = arr[i]/(i+1);
        }

        int index = MAX(oneVal,N);

        int result = 0;
        while(N != 0){
            if(N >= index) {
                N -= (index+1);
                result += arr[index];
            }
            else{
                index = MAX(oneVal, index);
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }

    public static int MAX(double oneVal[], int index){

        double value = oneVal[index-1];

        for(int i = index-1; i >=0; i--){
            if(oneVal[i] > value){
                value = oneVal[i];
                index = i;
            }
        }
        return index;
    }
}
// 시간 초과