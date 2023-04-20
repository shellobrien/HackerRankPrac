import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisjointIntervalMax {

    public static void main(String[] args) {

        final List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(4, 6));
        intervals.add(new Interval(2, 10));

        printDisjoinIntervals(intervals);

        System.out.println("--------------------");
        final List<Interval> intervals2 = new ArrayList<>();
        intervals2.add(new Interval(1, 4));
        intervals2.add(new Interval(2, 3));
        intervals2.add(new Interval(4, 6));
        intervals2.add(new Interval(8, 9));

        printDisjoinIntervals(intervals2);
    }

    private static void printDisjoinIntervals(List<Interval> intervals) {
        Collections.sort(intervals);

        int endPointOfFirstInterval = intervals.get(0).end();

        for (int i = 1; i < intervals.size(); i++) {
            int l1 = intervals.get(i).start();
            int r2 = intervals.get(i).end();

            // Check if given interval overlap with
            // previously included interval, if not
            // then include this interval and update
            // the end point of last added interval
            if (l1 > endPointOfFirstInterval) {
                System.out.print("[" +  l1+ ", "
                        + r2+ "]" +"\n");
                endPointOfFirstInterval = r2;
            }
        }
    }


}

record Interval(Integer start, Integer end) implements Comparable<Interval> {

    @Override
    public int compareTo(Interval obj) {
        if(this.end > obj.end)
            return 1;
        else if(this.end == obj.end)
            return 0;
        return -1;
    }
}
