import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MinAbsoluteDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>(n);
        IntStream.range(0, n).forEach(  i -> {
            numbers.add(scanner.nextInt());
        });
        minimumAbsoulteDifference(numbers);
        scanner.close();
    }

    private static int minimumAbsoulteDifference(List<Integer> arr) {
        int result = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
//            for (int j = i+1; j < arr.size() ; j++) {
//                if (Math.abs( arr.get(i) - arr.get(j)) < result) {
//                    result = Math.abs( arr.get(i) - arr.get(j));
//                }
//            }
            result = Math.min(result, Math.abs(arr.get(i +1) - arr.get(i)));
        }
        System.out.println(result);
        return result;
    }
}
