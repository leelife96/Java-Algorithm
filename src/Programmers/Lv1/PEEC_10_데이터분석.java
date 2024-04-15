package Programmers.Lv1;

import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        List<int []> result = new ArrayList<>();
        for(int[] da : data){
            if(ext.equals("code")){
                if(da[0] < val_ext){
                    result.add(da);
                }
            }
            if(ext.equals("date")){
                if(da[1] < val_ext){
                    result.add(da);
                }
            }
            if(ext.equals("maximum")){
                if(da[2] < val_ext){
                    result.add(da);
                }
            }
            if(ext.equals("remain")){
                if(da[3] < val_ext){
                    result.add(da);
                }
            }
        }

        if(sort_by.equals("code")){
            result.sort((d1, d2) -> d1[0] - d2[0]);
        }
        if(sort_by.equals("date")){
            result.sort((d1, d2) -> d1[1] - d2[1]);
        }
        if(sort_by.equals("maximum")){
            result.sort((d1, d2) -> d1[2] - d2[2]);
        }
        if(sort_by.equals("remain")){
            result.sort((d1, d2) -> d1[3] - d2[3]);
        }

        int[][] answer = new int[result.size()][data[0].length];
        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}