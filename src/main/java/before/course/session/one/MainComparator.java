package before.course.session.one;



import before.course.model.Person;

import java.util.function.Function;

public class MainComparator {

    public static void main(String... args) {

        //
        // Tasks: Napisac komparator dla age w klasie Person
        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge() ;
        Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()) ;
        Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()) ;

        //
        // Task: Napisz funkcje, ktora przetransformuje Person w Integer (age)
        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getLastName();
        Function<Person, String> f3 = p -> p.getFirstName();

        //
        // Task: Napisac Comparator<Person>, korzystajacy z Function<Person, Integer>

        //
        // !!! Uwaga: To nie dziala, bo Comparable jako parametr, a Comparable nie jest stringiem
        // Comparator<Person> cmpPersonAge = Comparator.comparing(f1);

        //
        //
        Comparator<Person> cmpPersonAge = Comparator.comparing(p -> p.getAge()); //  Function<Person, Integer> f1 = p -> p.getAge();

        //
        // Przekonwertowac comparator na before.course.method reference
        Comparator<Person> cmpPersonAgeLambda = Comparator.comparing(p -> p.getAge());
        Comparator<Person> cmpPersonAgeMethodReference = Comparator.comparing(Person::getAge); // p -> p.getAge() => Person::getAge


    }

    public int compareName(Person p1, Person p2) {
        //
        // TODO: 11/3/17  Przerobic comparing tak, zeby porownywac Name
        Comparator<Person> cmpPersonNameMethodReference = Comparator.comparingName(Person::getFirstName); // p -> p.getAge() => Person::getAge

        return cmpPersonNameMethodReference.compare(p2, p1);
    }

    public int chainedComparator(Person p1, Person p2) {

        // TODO: 11/3/17  Uzyc comparable
        Comparator<Person> ageComparator = Comparator.comparingComparable(Person::getAge);
        Comparator<Person> nameComparator = Comparator.comparingComparable(Person::getFirstName);

        // Jak porownac dwa obiekty uzywajac wlasnego comparatora ?
        // Comparator.compare(T, T)


        // TODO: 11/3/17  Zaimplementowac: Comparator<Person> comparatorPerson = comparatorPersonAge.
        // porownywanie obiektow po wieku, jesli wiek bedzie rowny, to porownywac po nazwisku;
        Comparator<Person> comparatorPerson = ageComparator.thenCompare(nameComparator);

        return comparatorPerson.compare(p1,
                p2);
    }

    public int comparing(Person p1, Person p2) {

        Comparator<Person> comparator = Comparator.comparing(p -> p.getAge());

        return comparator.compare(p1, p2);
    }
}
