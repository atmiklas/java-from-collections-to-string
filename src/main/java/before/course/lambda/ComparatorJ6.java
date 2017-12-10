package before.course.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jedrus on 10/31/2017.
 */
public class ComparatorJ6 {
    public static void main(String[] args) {
        // sortByImperativeComparator();
        sortByLambdaComparator();
    }

    private static void sortByLambdaComparator() {
        List<String> list = Arrays.asList(new String[] {"B", "A", "C"});

        //
        // Przekazanie kodu jako parametru
    //         Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

        System.out.println(list);
    }


    private static void sortByImperativeComparator() {
        List<String> list = Arrays.asList(new String[] {"B", "A", "C"});

        Comparator c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        Collections.sort(list, c);
        System.out.println(list);
    }
}
