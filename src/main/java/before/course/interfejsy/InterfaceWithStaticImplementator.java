package before.course.interfejsy;

/**
 * Created by amik on 11/3/17.
 */
public class InterfaceWithStaticImplementator implements InterfaceWithStatic {

    public static void main(String[] args) {
        InterfaceWithStatic.printuj();
    }

    //
    // Deklaracja metody statycznej w interfejsie nadrzednym
    // nie wplywa na klase implementujaca interfejs. W klasie tej mozna deklarowac metode statyczna jak w implementowanym
    // interfejsie;
    static void printujB() {
        System.out.printf("Printuje");
    }
}
