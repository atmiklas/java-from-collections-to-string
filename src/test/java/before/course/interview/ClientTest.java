package before.course.interview;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by amik on 11/22/17.
 */
public class ClientTest {

    @Test
    public void getMapTest() {
        Client client = new Client();

        List<Package> products = Arrays.asList(
                new Package(Size.A),
                new Package(Size.B),
                new Package(Size.C));
        Map<Size, List<Package>> map = client.getMap(products);

        assertNotNull(map.get(Size.A));
        assertNotNull(map.get(Size.B));
        assertNotNull(map.get(Size.C));

        assertEquals(map.get(Size.A).size(), 1);
        assertEquals(map.get(Size.B).size(), 1);
        assertEquals(map.get(Size.C).size(), 1);

        assertEquals(map.get(Size.A).get(0).getPackageSize(), Size.A);
        assertEquals(map.get(Size.B).get(0).getPackageSize(), Size.B);
        assertEquals(map.get(Size.C).get(0).getPackageSize(), Size.C);

    }
}