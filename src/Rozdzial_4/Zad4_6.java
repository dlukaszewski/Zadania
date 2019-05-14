package Rozdzial_4;

public class Zad4_6 {
    public static void main(String[] args) {

        int n = 10, i, j, suma;

        int macierz [][] = new int[n][n];

        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {

                if (n == i + j + 1) {
                    macierz[i][j] = i;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
        System.out.println();
        for (i = 0;i<macierz.length; i++){
            for (j=0;j<macierz.length;j++){
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        suma = 0;
        System.out.println();
        for (i = 0;i<macierz.length;i++){
            suma+=macierz[i][n-i-1];
        }
        System.out.println("Suma wyroznionych elementow tablicy wynosi " + suma);

    }
}
