package before.course.before;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by amik on 11/11/17.
 */
public class StreamDemo2 {

    public static Logger LOGGER = Logger.getLogger("before/course/streams");

    public static void main(String[] args) {

        //
        // Create a list of Integer values.
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        // Two ways to obtain the integer product of the elements
        // in myList by use of reduce().
        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if (productObj.isPresent()) {
            //
            // System.out.println("Product as Optional: " + productObj.get());
            LOGGER.info("Product as optional: " + productObj.get());
        }

        //
        // Uzyskanie integera ze streamu, z wykorzystaniem identity.
        int product = myList.stream().reduce(1, (a, b) -> a * b);

//        System.out.println("Product as int: " + product);
        LOGGER.debug("Product as int: " + product);
    }
}
