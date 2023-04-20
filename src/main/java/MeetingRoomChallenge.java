import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MeetingRoomChallenge {

    public static void main(String[] args) {

        final List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 18));
        intervals.add(new Interval(18, 23));
        intervals.add(new Interval(15, 29));
        intervals.add(new Interval(4, 15));
        intervals.add(new Interval(2, 11));
        intervals.add(new Interval(5, 13));

        final List<MeetingTuple> startTime = intervals.stream().map(i -> new MeetingTuple(i.start(), 1)).collect(Collectors.toList());

//        Collections.sort(startTime);

        final List<MeetingTuple> endTime = intervals.stream().map(i -> new MeetingTuple(i.end(), -1)).collect(Collectors.toList());

//        Collections.sort(endTime);

        startTime.addAll(endTime);
        Collections.sort(startTime);
        System.out.println(startTime);

        AtomicInteger curr = new AtomicInteger();
        AtomicInteger ans = new AtomicInteger();

        startTime.forEach(i -> {
            curr.addAndGet(i.increment());
            ans.set(Math.max(curr.get(), ans.get()));
        });

        System.out.println(ans.get());
    }
}

record MeetingTuple(int start, int increment) implements  Comparable<MeetingTuple> {

    @Override
    public int compareTo(MeetingTuple obj) {
        if(this.start > obj.start)
            return 1;
        else if(this.start == obj.start)
            return 0;
        return -1;
    }

}
