package Rozdzial_4;

public class Zad4_8 {
    public static void main(String[] args) {

        int n = 10, i,j;

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        System.out.println("Tablica A");
        for (i=0;i<a.length;i++){
            for (j=0;j<a.length;j++){

                a[i][j] = j;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tablica B");
        for (i=0;i<b.length;i++){
            for (j=0;j<b.length;j++){

                b[i][j] = 0;
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Przepisana Tablica A do B z odwroconymi wierszami");
        for (i=0;i<b.length;i++) {
            for (j = 0; j < b.length; j++) {

                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
