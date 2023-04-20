import java.util.Scanner;

public class Hack07 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double d2 = scanner.nextDouble();
        String str2 = scanner.nextLine();
        str2 += scanner.nextLine();
        System.out.println(i + x);
        System.out.println(d + d2);
        System.out.println(s + str2);
        scanner.close();
    }
}
