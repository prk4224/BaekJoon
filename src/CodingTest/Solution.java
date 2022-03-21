package CodingTest;

import java.util.Arrays;

class Solution {

    public static void main(String[] args){

        int array[] = {1,5,2,6,3,7,4};
        int commands[][] = {{2,5,3}, {4,4,1}, {1,7,3}};

        for(int i : solution(array, commands)){
            System.out.print(i);
        }
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++){

            int arr[] = new int[commands[i][1]-commands[i][0]+1];

            for(int j = commands[i][0]-1, h = 0;
                j < commands[i][1]; j++, h++ ) {

                arr[h] = array[j];
            }
            Arrays.sort(arr);

            for(int j = 0; j < arr.length; j++){
                if(j == commands[i][2]-1){
                    answer[i] += arr[j];
                    break;
                }
            }

        }

        return answer;
    }
}