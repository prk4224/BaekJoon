package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_5635 {

    public static int[] minAge;
    public static int[] maxAge;
    public static int[][] age;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] name = new String[N];
        age = new int[N][3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken();
            age[i][2] = Integer.parseInt(st.nextToken());
            age[i][1] = Integer.parseInt(st.nextToken());
            age[i][0] = Integer.parseInt(st.nextToken());
        }

        minAge = age[0];
        maxAge = age[0];
        String minName = name[0];
        String maxName = name[0];

        for(int i = 1; i < N; i++){

            if(minCheck(i,0)){
                minName = name[i];
            }
            else if (minAge[0] == age[i][0]){

                if( minCheck(i,1)){
                    minName = name[i];
                }
                else if(minAge[1] == age[i][1]){
                    if( minCheck(i,2)){
                        minName = name[i];
                    }
                }

            }


            if(maxCheck(i,0)){
                maxName = name[i];
            }
            else if (maxAge[0] == age[i][0]){

                if( maxCheck(i,1)){
                    maxName = name[i];
                }
                else if(maxAge[1] == age[i][1]){
                    if( maxCheck(i,2)){
                        maxName = name[i];
                    }
                }

            }
        }

        System.out.println(minName);
        System.out.println(maxName);
    }

    public static boolean minCheck(int i, int x){

        if(minAge[x] < age[i][x]){
            minAge = age[i];
            return true;
        }

        return false;
    }

    public static boolean maxCheck(int i, int x){

        if(maxAge[x] > age[i][x]){
            maxAge = age[i];
            return true;
        }

        return false;
    }
}
