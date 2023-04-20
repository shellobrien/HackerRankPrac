import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StringPalindrome {

    public static void main(String[] args) {

        System.out.println("apple " + isPalindrome("apple"));
        System.out.println("radar "  + isPalindrome("radar"));
        System.out.println("daD "  + isPalindrome("daD"));
        System.out.println("Noon "  + isPalindrome("Noon"));
        System.out.println("findDupicate " +  findDuplicates("JavaJavaJee"));
        fibonacci();
        System.out.println();
        System.out.println("factorial " + factorialUsingStreams(4));

        double total = 0.0d;
        double x = 0.2d;
        double y = 0.3d;
        total = x + y;
        System.out.println("total = " + total);
        System.out.println("ceil = " + Math.ceil(1.34) + " floor= " + Math.floor(1.34) + " abs= " + Math.abs(0.57243243948304238404));

    }

    private static boolean isPalindrome(String str) {
        String tempString = str.replaceAll("\\s+", "").toLowerCase();

        return IntStream.range(0, tempString.length() /2)
                .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i -1));
    }

    private static void fibonacci() {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(x -> System.out.print(x));
    }

    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

    private static String findDuplicates(String str) {

        System.out.println(str.chars().distinct()
                .mapToObj(item -> (char) item)
                .map(Object::toString)
                .collect(Collectors.joining()));

        Map<Character, Long > result = str
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        result.forEach((k, v) -> System.out.println(k + " : " + v));
         return str.chars().distinct().collect(
                 StringBuilder::new,
                 StringBuilder::appendCodePoint,
                 StringBuilder::append
         ).toString();



    }
}
