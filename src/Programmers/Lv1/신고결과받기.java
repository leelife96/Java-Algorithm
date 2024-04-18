package Programmers.Lv1;

import java.util.*;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 사용자, 신고한 사용자 목록
        Map<String, List<String>> map_reportlist = new HashMap<>();
        // 사용자, 신고한 횟수
        Map<String, Integer> map_reportcount = new HashMap<>();

        for(int i=0; i<id_list.length; i++) {
            List<String> list = new ArrayList<>();
            map_reportlist.put(id_list[i], list);
            map_reportcount.put(id_list[i], 0);
        }

        for(String temp : report) {
            String[] arr = temp.split(" ");
            String reporter = arr[0];
            String badman = arr[1];
            List<String> list = map_reportlist.get(badman);
            if(list.contains(reporter)){
                continue;
            }
            list.add(reporter);
            map_reportlist.put(badman, list);
        }

        for(String data: map_reportlist.keySet()){
            List<String> list = map_reportlist.get(data);
            if(list.size() >= k){
                for(String user : list){
                    int count = map_reportcount.get(user)+1;
                    map_reportcount.put(user,count);
                }
            }
        }
        int i=0;
        int[] answer = new int[id_list.length];
        for(String data: id_list){
            answer[i] = map_reportcount.get(data);
            i++;
        }
        return answer;
    }
}
