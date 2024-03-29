package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 문자열반복_2675 {
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder stringBuilder = new StringBuilder();
       int T = Integer.parseInt(bufferedReader.readLine());

       for(int i=0; i<T; i++) {
           StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
           int R = Integer.parseInt(stringTokenizer.nextToken());
           String S = stringTokenizer.nextToken();

           for(int j=0; j<S.length(); j++) {
               int count=0;
               while (count < R) {
                   stringBuilder.append(S.charAt(j));
                   count++;
               }

           }
           stringBuilder.append("\n");
       }
        System.out.println(stringBuilder);
    }
}
