package before.course.before.after;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by amik on 11/11/17.
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        Stream<Integer> lettersStream = Stream.of(1, 2, 3);
        Optional<Integer> optional = lettersStream.unordered().parallel().reduce((a, b) -> a * b);
        if(optional.isPresent()) {
            System.out.println(optional.get());
        }

        Stream.of(1, 2, 3).unordered().forEach(System.out::println);
        //
        // Parallel stream;
        Stream.of(1,2,3).parallel();
        Stream.of(1,2,3).parallel().sequential();

        // Seq stream;
        Stream.of(1,2,3).sequential();

        //
        // Reduce
        Stream.of(1,2,3).reduce((a, b) -> a * b);

        //
        // Ordered stream;
        {
            Set<Integer> hashSet = new HashSet<>();
            hashSet.stream().forEach(System.out::println);
        }

        {
            Set<Integer> hashSet = new HashSet<>();
            hashSet.stream().parallel().forEachOrdered(System.out::println);
        }

    }
}
