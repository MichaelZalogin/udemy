package javaCourseBlackBelt.stream;

import java.util.stream.Stream;

public class StreamDistinct {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream.distinct().forEach(System.out::println);
        System.out.println("===========");

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream2.count());
    }
}