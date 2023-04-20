import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class MarcMinCupCakeCalories {

//    IntStream.range(0, n).forEach(i -> {
//        result.addAndGet((int)(Math.pow(2, i) * b));
//        System.out.print(Integer.toString(result.get())  + ' ');
//
//    });

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> calories = new ArrayList<>(n);
        IntStream.range(0, n).forEach(  i -> {
            calories.add(scanner.nextInt());
        });

        System.out.println(marcsCakewalk(calories));

        scanner.close();
    }

    public static long marcsCakewalk(List<Integer> calories) {
        calories.sort(Collections.reverseOrder());
        System.out.println(calories);
        AtomicInteger power = new AtomicInteger(0);
        AtomicLong result = new AtomicLong(0L);
        calories.forEach(c -> {
            final int p = power.getAndIncrement();
            System.out.print("power =  " + p + " 2 power = " + Math.pow(2, p) + ",");
            result.addAndGet((long) (Math.pow(2, p) *  c));
            System.out.println(result.get());
        });

        System.out.println();
        return result.get();
    }
}
