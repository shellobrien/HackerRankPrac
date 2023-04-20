import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Hack04 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        printMultiplesof10(N);
        bufferedReader.close();
    }

    private static void printMultiplesof10(int n) {

        IntStream.rangeClosed(1, 10).forEach(i -> {
                     var number = i * n;
                     System.out.println( n + " X " + i + " = " + number);
                }
        );
    }
}
