package JavaZadZProgramowania.Rozdzial_4;

public class Zad4_4 {
    public static void main(String[] args) {

        int n = 10;
        int i , j , suma;

        int macierz [][] = new int[n][n];

        for (i = 0;i<macierz.length;i++){

            for (j = 0;j<macierz.length;j++){

                if (i==j){
                    macierz[i][j] = i;
                }else{
                    macierz[i][j] = 0;
                }
            }
        }
        for (i = 0 ; i< macierz.length;i++){
            for (j=0;j<macierz.length;j++){
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        suma = 0;
        for (i  = 0; i < macierz.length; i++){
            suma+= macierz[i][i];
        }
        System.out.println("Suma wyroznionych elementow w tablicy dwu wymiarowej jest rowna = " + suma);



    }
}
