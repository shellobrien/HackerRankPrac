import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNumbers {

    public static List<Integer> oddNumbers(int l, int r) {
        return IntStream.rangeClosed(l, r).filter(x -> x % 2 != 0).boxed().collect(Collectors.toList());

    }


    public static void main(String[] args) {

        System.out.println(oddNumbers(1, 11));
    }
}
