package Programmers.Lv1;

import java.util.*;

public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(ch[i] > 'z'){
                ch[i] -= 26;
            }
            int idx = 0;
            while(idx < index) {
                ch[i]++;
                if(ch[i] > 'z'){
                    ch[i] -= 26;
                }
                if(!skip.contains(String.valueOf(ch[i]))){
                    idx++;
                }
            }
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}
