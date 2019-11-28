package JavaZadZProgramowania.Rozdzial_4;

public class Zad4_15 {
    public static void main(String[] args) {
        int n = 100,suma = 0;
        System.out.println("Program sumuje wartosci liczb od 1 do 100 w tablicy Dane");
        int dane [] = new int [n];

        for (int i = 1;i <= dane.length;i++){
            dane[i-1]=i;
        }
        for (int x : dane){
            suma+=x;
        }
        System.out.println("Suma liczb z tablicy Dane jest rowna = " + suma);
    }
}
