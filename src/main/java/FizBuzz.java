import java.util.stream.IntStream;

public class FizBuzz {

    public static void main(String[] args) {
        fizzBuzz(15);
    }

    public static void fizzBuzz(int n) {
        IntStream.rangeClosed(1, n).forEach(i ->
        {
            printFizzBuzz(i);
        });
    }

    private static void printFizzBuzz(int i) {
        if (i % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }


}
