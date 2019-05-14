package Rozdzial_4;

public class Zad4_7 {
    public static void main(String[] args) {

        int n = 10,i,j,suma;

        int macierz[][] = new int [n][n];


        for (i = 0; i < macierz.length; i++){
            for (j = 0; j < macierz.length;j++){
                if (j == 0){
                    macierz[i][j] = i;
                }
                if (j==1){
                    macierz[i][j] = i*i;
                }
                if (j>1){
                    macierz[i][j] = 0;
                }
            }

        }
        for (i = 0; i < macierz.length; i++){
            for (j = 0; j < macierz.length;j++){
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        suma =0;

        for (i = 0; i < macierz.length;i++){
            suma+= macierz[i][0];
        }
        System.out.println("Suma Liczb z pierwszej kolumny jest rowna = " + suma);
        suma = 0;
        for (i = 0; i < macierz.length;i++){
            suma+= macierz[i][1];
        }
        System.out.println("Suma Liczb z drugiej kolumny jest rowna = " + suma);




        }
}
