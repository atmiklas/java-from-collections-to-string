package before.course.comparator;

import before.course.model.Person;

import java.util.Comparator;
import java.util.function.Function;

/**
 * Created by amik on 11/1/17.
 */
@FunctionalInterface
public interface CustomComparator<T> extends Comparator<T> {
    int compare(T o1, T o2);

    static Comparator<Person> comparing(Function<Person, Integer> ageFuction) {
        return (p1, p2) -> ageFuction.apply(p1) - ageFuction.apply(p2);
    }
}
