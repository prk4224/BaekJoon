package CodingTest;

import java.util.*;

class Solution02 {

    public static void main(String[] args){
        int[] priorities = {13,2,25,3,5,6,7,8,20};
        int location = 1;

        System.out.println(solution(priorities, location));
    }

    public static int solution  (int[] priorities, int location) {

        Queue<Integer> queue = new LinkedList<Integer>();

        int answer = 0;
        int target = location;

        for(int i = 0; i < priorities.length; i++){
            queue.add(priorities[i]);
        }

        Arrays.sort(priorities);

        int size = priorities.length-1;

        while(!queue.isEmpty()){
            Integer num = queue.poll();
            if(num == priorities[size - answer]){
                answer++;
                target--;
                if( target == -1){
                    break;
                }
            }
            else{
                queue.add(num);
                target--;
                if(target == -1) {
                    target = queue.size() - 1;
                }
            }
        }

        return answer;
    }
}
