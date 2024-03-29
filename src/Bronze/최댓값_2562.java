package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값_2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int max=0;
        int count=0;
        int index=0;

        for ( int value : arr) {
            count++;
            if(value>max) {
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
