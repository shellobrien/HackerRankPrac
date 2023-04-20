import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hack01 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        task(N);
    }

    private static void task(int n) {

        if ( (n % 2 != 0) ||  ((n >= 6 && n <= 20 && n % 2 == 0))) {
            System.out.println("Weird");
        } else if (( n >= 2 && n <= 5) || (n >20) && n % 2 == 0) {
            System.out.println("Not Weird");
        }
    }
}
