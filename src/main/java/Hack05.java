import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Hack05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int k = 0; k < q; k++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            printSequence(a, b, n);
       }

        scanner.close();

    }

    private static void printSequence(int a, int b, int n) {

        AtomicInteger result = new AtomicInteger(a);
        IntStream.range(0, n).forEach( i -> {
             result.addAndGet((int)(Math.pow(2, i) * b));
            System.out.print(Integer.toString(result.get())  + ' ');

        });
        System.out.println();
    }
}
