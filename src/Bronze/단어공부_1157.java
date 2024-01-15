package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine().toUpperCase();
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            count[num]++;
        }

        int max=0;
        char answer = '?';

        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]) {
                answer = '?';
            }
            
        }
        System.out.println(answer);
    }
}
