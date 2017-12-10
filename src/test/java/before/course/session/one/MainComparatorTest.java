package before.course.session.one;

import before.course.model.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainComparatorTest {

    private MainComparator mainComparator = new MainComparator();

    @Test
    public void chainedComparator() throws Exception {


        Person p1 = Person.builder().age(12).firstName("Anna").lastName("Nowak").build();
        Person p2 = Person.builder().age(1).firstName("Basia").lastName("Miklas").build();

        assertEquals(1, mainComparator.chainedComparator(p1, p2));
    }

    @Test
    public void compareName() {
        Person p1 = Person.builder().age(12).firstName("Anna").lastName("Nowak").build();
        Person p2 = Person.builder().age(1).firstName("Basia").lastName("Miklas").build();

        assertEquals(1, mainComparator.compareName(p1, p2));
    }

    @Test
    public void comparing() {
        Person p1 = Person.builder().age(12).firstName("Anna").lastName("Nowak").build();
        Person p2 = Person.builder().age(1).firstName("Basia").lastName("Miklas").build();

        assertEquals(1, mainComparator.comparing(p1, p2));
    }


}