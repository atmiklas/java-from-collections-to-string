package before.course.session.one;



import before.course.model.Person;

import java.util.function.Function;

@FunctionalInterface // Opcjonalne: kazdy interfejs z metoda abstrakcyjna jest functional
public interface Comparator_v000<T> {

    //
    // Fi - musi mied tylko jedna metode abstrakcujna

    /**
     *
     * @param t1
     * @param t2
     * @return
     *
     * 0 - equals,
     * 1 - p1 > p2
     * 1 - p1 < p2
     */
    int compare(T t1, T t2);

    //
    // Imlementacja Comparator<Person> jest metoda:
    // public int compare(T t1, T t2);
    static Comparator_v000<Person> comparing(Function<Person, Integer> f) {
        //
        // Co zwraca ta before.course.lambda ?
        // Kazda before.course.lambda zwraca FunctionalInterface, dlatego ta before.course.lambda zwraca functional interface
        // z implementacja metody:
        // public int compare(T t1, T t2);
        return (p1, p2) ->  f.apply(p1) - f.apply(p2);
    }

    static Comparator_v000<Person> comparingName(Function<Person, String> f) {
        return (p1, p2) ->  f.apply(p1).compareTo(f.apply(p2)) ;
    }

    static Comparator_v000<Person> comparingComparable(Function<Person, Comparable> f) {
        return (p1, p2) ->  f.apply(p1).compareTo(f.apply(p2)) ;
    }

    //
    // default Comparator<Person> thenCompare(Comparator<Person> personComparableMethodReferenceName) {
    // err: compare (T, T) cannot be applied to comapre(Person, Person)
    default Comparator_v000<T> thenCompare(Comparator_v000<T> chainedComparator) {
        //
        // Jesli wiek jest rowny, to porownaj wedle fn.

        //
        // Co musze zwrocic ? Lambde
        return (p1, p2) -> compare(p1, p2) == 0 ? chainedComparator.compare(p1, p2) : compare(p1, p2);
    }


}
