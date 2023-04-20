import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestPermutation {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 4, 6 , 5, 0);
        int k = 3;
//        Collections.sort(numbers, Collections.reverseOrder());
//        System.out.println(numbers);

        int i = 0;
        int _max = Collections.max(numbers);
        System.out.println(_max);

        while ( k > 0 && i < numbers.size()) {

            int j =  numbers.indexOf(_max);
            if ( i != j) {
                k -=1;
                Collections.swap(numbers, i, j);
            }
            i++;
            _max--;
        }
        System.out.println(numbers);
    }
}
