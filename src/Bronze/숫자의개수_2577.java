package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int result = a * b * c;

        String str = String.valueOf(result);

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 48]++;

        }

        for (int value : arr) {
            System.out.println(value);
        }
    }
}
