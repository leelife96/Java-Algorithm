package Programmers.Lv1;

import java.util.*;
public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        int temp = -1;

        for(int i=0; i<arr.length; i++){
            if(temp != arr[i]){
                temp = arr[i];
                result.add(arr[i]);
            }
        }

        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
