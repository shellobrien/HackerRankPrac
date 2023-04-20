import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class BulbOnOff {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> sequence = new ArrayList<>(n);
        for(int i = 0 ; i < n; i++){
            int x = scanner.nextInt();
            sequence.add(x);
        }

        System.out.println("old seq" + sequence);
        costToflipTheSwtich(sequence);

        scanner.close();
    }

    private static void costToflipTheSwtich(List<Integer> sequence) {
        List<Integer> newSequence = new ArrayList<>();
          int count = 0;
        for (int i = 0; i < sequence.size(); i++)
        {
            /* if the bulb's original state is on and count
               is even, it is currently on...*/
            /* no need to press this switch */
            if (sequence.get(i) == 1 && count%2 == 0) {
                newSequence.add(sequence.get(i) );
            }

            /* If the bulb's original state is off and count
               is odd, it is currently on...*/
                /* no need to press this switch */
            else if(sequence.get(i) == 0 && count%2 != 0) {
                newSequence.add(sequence.get(i) );
            }

            /* if the bulb's original state is on and count
               is odd, it is currently off...*/
            /* Press this switch to on the bulb and increase
               the count */
            else if (sequence.get(i) == 1 && count%2 != 0)
            {
                newSequence.add(1 - sequence.get(i));
                count++;
            }

            /* if the bulb's original state is off and
               count is even, it is currently off...*/
            /* press this switch to on the bulb and
               increase the count */
            else if (sequence.get(i) == 0 && count%2 == 0)
            {
                newSequence.add(1 - sequence.get(i));
                count++;
            }
        }

//        AtomicInteger count = new AtomicInteger();
//        sequence.forEach(i -> {
//
//            if (i == 1 && count.get() %2 != 0) {
//                count.getAndIncrement();
//                i = 0;
//                newSequence.add(i);
//            } else
//                if (i == 0 && count.get() %2 != 0) {
//                count.getAndIncrement();
//                i = 1;
//                newSequence.add(i);
//            } else {
//                newSequence.add(i);
//            }
//        });

        System.out.println("new Seq = " + newSequence);
        System.out.println("cost = " + count);
    }

    private static void toggleSwitch(List<Integer> sequence, Integer i) {

    }
}
