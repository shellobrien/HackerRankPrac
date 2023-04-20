import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeSort {

    public static void main(String[] args) {

        String [] result = new String[] {"z", "a", "b", "t", "k", "m"};

        mergeSortAlgo(result, result.length);
        Stream.of(result).forEach(System.out::println);
        List<String> ls = new ArrayList<>();

    }

    private static void mergeSortAlgo(String[] result, int length) {

        int mid = length / 2;
    }
}
