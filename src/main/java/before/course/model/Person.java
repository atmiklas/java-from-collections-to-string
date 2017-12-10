package before.course.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Created by amik on 11/1/17.
 */
@Data
@Builder
@ToString
public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
}
