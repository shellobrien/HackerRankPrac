import java.util.Scanner;

public class Hack02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        double d = scanner.nextDouble();

        String str2 = scanner.nextLine();
        str2 += scanner.nextLine();
        System.out.println("String: " +  str2);
        System.out.println("Double: " + d);
        System.out.println("Int: " + x);
        scanner.close();
    }
}
