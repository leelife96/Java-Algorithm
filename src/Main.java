
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       int num = Integer.parseInt(bufferedReader.readLine());

        for (int i = num; i <= num; i++) {
            for(int j=1; j<=9; j++) {
                System.out.printf("%d * %d = %d", num, j, num*j);
                System.out.println();
            }
            
        }

    }
}