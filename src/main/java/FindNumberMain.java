import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindNumberMain {


    public static String findNumbers(List<Integer> numbers, int k) {
        final Optional<Integer> integerOptional = numbers.stream().filter(i -> i == k).findFirst();
        if (integerOptional.isPresent()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 10, 15);
        System.out.println("findNumber 4  " + findNumbers(numbers, 4));
        System.out.println("findNumber 5  " + findNumbers(numbers, 5));
        System.out.println("findNumber 10  " + findNumbers(numbers, 10));
    }
}
