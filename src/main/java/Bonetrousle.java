import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Bonetrousle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sampleInput = sc.nextInt();

        IntStream.range(0, sampleInput).forEach( i -> {
            long n = sc.nextLong(); // no of sticks 12
            long k = sc.nextLong(); // 1, 2, 3, 4, 5, 6, 7, 8 total boxes
            int b = sc.nextInt(); // 3 max no of boxes

            long minSum = (long) (1 + b) * b / 2;
            System.out.println(minSum);
            bonetrousle(n, k, b);
        });

        sc.close();
    }

    public static List<Long> bonetrousle(long n, long k, int b) {

        List<Long> noOfBoxes = new ArrayList<>();


        return noOfBoxes;
    }
}
