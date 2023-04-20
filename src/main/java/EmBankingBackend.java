import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmBankingBackend {


    public static void main(String[] args) {

        Map<String, String> alphabetsToNumericValue = alphabetsToNumericValue();

        String str = "23511011501782351112179911801562340161171141148";

        final String reverseString = getReverseString(str);
        StringBuilder decodedString = decodeString(alphabetsToNumericValue, reverseString);
        System.out.println("decodedString = " +  decodedString);

        String str1 = "1219950180111108236115111016623101401611235115012312161151110101111127";
        System.out.println("decodedString = " +   decodeString(alphabetsToNumericValue, getReverseString(str1)));

        String str2 =  "2312179862310199501872379231018117927";
        System.out.println("decodedString = " +   decodeString(alphabetsToNumericValue, getReverseString(str2)));
    }

    private static String getReverseString(String str) {
        final String reverseString = Stream.of(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        return reverseString;
    }

    private static StringBuilder decodeString(Map<String, String> alphabetsToNumericValue, String reverseString) {
        int i = 0;
        StringBuilder decodedString = new StringBuilder();
        final char[] charArray = reverseString.toCharArray();

        while ( i < reverseString.length()) {
            if ((charArray[i] >= '6' && charArray[i] <= '9') || charArray[i] == '3') {
                String asciiChar  = String.valueOf(charArray[i]) + charArray[++i];
                decodedString.append(alphabetsToNumericValue.get(asciiChar));
            }

            if (charArray[i] == '1') {
                String asciiChar  = String.valueOf(charArray[i]) + charArray[++i] + charArray[++i];
                decodedString.append(alphabetsToNumericValue.get(asciiChar));
            }
            ++i;

        }
        return decodedString;
    }

    private static Map<String, String> alphabetsToNumericValue() {
        Map<String, String> alphabetsToNumericValue = new HashMap<>();
        alphabetsToNumericValue.put("32", " ");
        char c = 'A';
        for (int i = 65; i <=90 ; i++) {
            alphabetsToNumericValue.put(String.valueOf(i), String.valueOf(c));
            ++c;
        }
        char c1 = 'a';
        for (int i = 97; i <=122 ; i++) {
            alphabetsToNumericValue.put(String.valueOf(i), String.valueOf(c1));
            c1++;
        }
        return alphabetsToNumericValue;
    }

}
