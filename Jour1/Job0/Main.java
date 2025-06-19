package Jour1.Job0;
public class Main {
    public static void main(String[] args) {
        char lettre = 'A';
        String texte = "Bonjour";
        int entier = 42;
        long grandEntier = 123456789L;
        float reel = 3.14f;
        boolean estVrai = true;

        System.out.println("char: " + lettre);
        System.out.println("String: " + texte);
        System.out.println("int: " + entier);
        System.out.println("long: " + grandEntier);
        System.out.println("float: " + reel);
        System.out.println("boolean: " + estVrai);

        int TOTO = (int) 3.817;
        System.out.println("TOTO: " + TOTO);
        // On constate que la partie décimale est perdue, TOTO vaut 3
    }
}
