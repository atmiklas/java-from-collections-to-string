package before.course.comparator;

import before.course.model.Person;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by amik on 11/1/17.
 */
public class FunctionBasedComparatorTest {
    @Test
    public void compareBasingOnCustomComparator() throws Exception {
        FunctionBasedComparator functionBasedComparator = new FunctionBasedComparator();

        List<Person> inputList = Arrays.asList(Person.builder().id(1).age(Byte.valueOf("1")).build()
                , Person.builder().id(2).age((byte) 2).build());
        List<Person> outputList = functionBasedComparator.compareBasingOnCustomComparator(inputList);

        assertEquals(false, outputList.get(0).getAge() > outputList.get(1).getAge());
    }
}