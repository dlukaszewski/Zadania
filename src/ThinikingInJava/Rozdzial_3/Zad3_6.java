package ThinikingInJava.Rozdzial_3;

public class Zad3_6 {
    static class Dog{
        String imie;
        String dajGlos;
    }

    public static void main(String[] args) {
        Dog mika = new Dog();
        Dog hugo = new Dog();
        Dog fifi = mika;

        mika.imie = "Mika";
        mika.dajGlos = "Wrrr";
        hugo.imie = "Hugo";
        hugo.dajGlos = "Hau";
        System.out.println("Pies " + mika.imie + " szczeka " + mika.dajGlos + " "+ mika.dajGlos);
        System.out.println("Pies " + hugo.imie + " szczeka " + hugo.dajGlos + " " + hugo.dajGlos);
        System.out.println(mika.imie==hugo.imie);
        System.out.println(mika.imie.equals (hugo.imie));
        System.out.println(mika.dajGlos == hugo.dajGlos);
        System.out.println(mika.dajGlos.equals(hugo.dajGlos));
        System.out.println(mika.imie == fifi.imie);
        System.out.println(mika.imie.equals(fifi.imie));
        System.out.println(mika.dajGlos == fifi.dajGlos);
        System.out.println(mika.dajGlos.equals(fifi.dajGlos));
    }
}
