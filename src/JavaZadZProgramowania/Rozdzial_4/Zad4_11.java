package JavaZadZProgramowania.Rozdzial_4;

public class Zad4_11 {
    public static void main(String[] args) {

        int n = 10, i , j;

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];
        System.out.println("Tablica A");
        for (i=0;i<a.length;i++){
            for (j=0;j<a.length;j++){
                a[i][j] = 3;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tablica B");
        for(i=0;i<b.length;i++){
            for (j=0;j<b.length;j++){
                b[i][j] = 2;
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tablica C ktora zawiera iloraz liczb z tablicy A i B");
        for(i=0;i<c.length;i++){
            for (j=0;j<c.length;j++){

                for (int k=0;k<c.length;k++){
                    c[i][j] += a[i][k]*b[k][j];

                }System.out.print(c[i][j] + " ");


            }System.out.println();

        }

    }





}
