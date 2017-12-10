import lombok.extern.java.Log;
import before.course.model.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by amik on 11/1/17.
 */
@Log
public class PersonTest {


    @Test
    public void ageSortingTest() {
        List<Person> personsList = Arrays.asList(Person.builder().id(1).age(Byte.valueOf("1")).build()
                , Person.builder().id(2).age((byte) 2).build());
        // before.course.model.Person person = new before.course.model.Person();
        Comparator<Person> ageComparator = (p1, p2) -> (p2.getAge() - p1.getAge());

        Collections.sort(personsList, ageComparator);
        assertEquals(true, personsList.get(0).getAge() > personsList.get(1).getAge());
    }

    @Test
    public void nameSortingTest() {
        List<Person> personsList = Arrays.asList(Person.builder().id(1).firstName("Anna").build()
                , Person.builder().id(2).firstName("Joanna").build());
        // before.course.model.Person person = new before.course.model.Person();
        Comparator<Person> nameComparator = (p1, p2) -> (p1.getFirstName().compareTo(p2.getFirstName()));

        Collections.sort(personsList, nameComparator);
        log.info(""+personsList);

        assertEquals(true, personsList.get(0).getId() < personsList.get(1).getId());
    }

}