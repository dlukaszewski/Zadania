package JavaZadZProgramowania.Rozdzial_3;

public class Zad3_10 {
    public static void main(String[] args) {

        System.out.println("Program sumuje liczby parzyste od 1 do 100");

        int z = 0;
        for (int x= 0;x<=100;x++ ) {

            if(x%2 ==0){
                z += x;
                System.out.println(z);
            }


        }
        System.out.println("Suma liczb parzystych od 1 do 100 to " + z);


    }
}
