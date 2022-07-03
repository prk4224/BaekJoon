package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_2564 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());
        int store[][] = new int[N][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            store[i][0] = Integer.parseInt(st.nextToken());
            store[i][1] = Integer.parseInt(st.nextToken());
        }

        int per[] = new int[2];
        st = new StringTokenizer(br.readLine());
        per[0] = Integer.parseInt(st.nextToken());
        per[1] = Integer.parseInt(st.nextToken());
        int sum = 0;

        for(int i = 0; i < N; i++){

            if(store[i][0] == per[0]){
                sum += Math.abs(store[i][1] - per[1]);

            }
            else if((store[i][0] == 1 && per[0] == 2) || (store[i][0] == 2 && per[0] == 1)){
                sum += ( col + (Math.min(store[i][1]+ per[1], row-store[i][1] + row-per[1]) ));


            }

            else if((store[i][0] == 3 && per[0] == 4) || (store[i][0] == 4 && per[0] == 3)){
                sum += ( row + (Math.min(store[i][1]+ per[1], col-store[i][1] + col-per[1]) ));

            }


            else if((store[i][0] == 1 && per[0] == 3) || (store[i][0] == 3 && per[0] == 1)){
                sum += (store[i][1] + per[1]);

            }
            else if((store[i][0] == 2 && per[0] == 4) || (store[i][0] == 4 && per[0] == 2)){
                sum += ((row+col) - (store[i][1] + per[1]));

            }
            else if(store[i][0] == 1 && per[0] == 4){
                sum += ((row-store[i][1]) + per[1]);

            }
            else if(store[i][0] == 4 && per[0] == 1){
                sum += ((row-per[1]) + store[i][1]);
            }
            else if(store[i][0] == 2 && per[0] == 3){
                sum += ((col-per[1]) + store[i][1]);

            }
            else if(store[i][0] == 3 && per[0] == 2){
                sum += ((col-store[i][1]) + per[1]);

            }

        }

        System.out.println(sum);


    }

}
