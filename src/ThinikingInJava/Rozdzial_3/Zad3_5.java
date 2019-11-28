package ThinikingInJava.Rozdzial_3;

public class Zad3_5 {
    static class Dog{
        String imie;
        String dajGlos;
    }

    public static void main(String[] args) {
        Dog mika = new Dog();
        Dog hugo = new Dog();
        mika.imie = "Mika";
        mika.dajGlos = "Wrrr";
        hugo.imie = "Hugo";
        hugo.dajGlos = "Hau";
        System.out.println("Pies " + mika.imie + " szczeka " + mika.dajGlos + " "+ mika.dajGlos);
        System.out.println("Pies " + hugo.imie + " szczeka " + hugo.dajGlos + " " + hugo.dajGlos);
    }
}
