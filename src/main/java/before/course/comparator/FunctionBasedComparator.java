package before.course.comparator;

import before.course.model.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;

/**
 * Created by amik on 11/1/17.
 */
public class FunctionBasedComparator {

    public List<Person> compareBasingOnCustomComparator(Collection<Person> personsList) {
        List<Person> inputList = Arrays.asList(Person.builder().id(1).age(Byte.valueOf("1")).build()
                , Person.builder().id(2).age((byte) 2).build());

        Function<Person, Integer> ageFunction = (p) -> p.getAge();
        Collections.sort(inputList, CustomComparator.comparing(ageFunction));

        return inputList;
    }
}
