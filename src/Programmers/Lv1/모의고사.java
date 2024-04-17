package Programmers.Lv1;

import java.util.*;

public class 모의고사 {
    public int[] solution(int[] answers) {
        List<Integer> result = new ArrayList<>();

        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        int a_max = 0;
        int b_max = 0;
        int c_max = 0;

        for(int z=0; z<answers.length; z++) {
            if(answers[z] == a[z%5]) {
                a_max++;
            }
            if(answers[z] == b[z%8]) {
                b_max++;
            }
            if(answers[z] == c[z%10]) {
                c_max++;
            }
        }

        int max = Math.max(Math.max(a_max, b_max), c_max);

        if(a_max == max) {
            result.add(1);
        }
        if(b_max == max) {
            result.add(2);
        }
        if(c_max == max) {
            result.add(3);
        }

        int[] hello = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            hello[i] = result.get(i);
        }

        Arrays.sort(hello);

        return hello;
    }
}
