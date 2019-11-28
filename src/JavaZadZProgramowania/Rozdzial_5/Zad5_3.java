package JavaZadZProgramowania.Rozdzial_5;

import java.util.Random;

public class Zad5_3 {


    int i,j,suma;
    public void czytaj_dane(double [][]macierz,int rozmiar){

        Random random = new Random();
        i = random.nextInt();
        for (i = 0; i<rozmiar;i++){
            for (j = 0;j<rozmiar;j++){
                if (i==j){
                    macierz[i][j] = Math.round(9*(random.nextDouble()));
                }else {
                    macierz[i][j] = 0;
                }
            }
        }
    }
    public void przetworz_dane(double[][]macierz,int rozmiar){
        for (i = 0; i< rozmiar;i++){
            suma+=macierz[i][i];
        }
        System.out.println("suma liczb z przekatnej wynosi " + suma);
    }
    public void wyswietl_dane(double[][]macierz,int rozmiar){
        for (i = 0; i<rozmiar;i++){
            for (j=0; j<rozmiar;j++){
                System.out.print((int)macierz[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rozmiar = 10;
        double macierz[][] = new double[rozmiar][rozmiar];
        Zad5_3 matrix = new Zad5_3();
        matrix.czytaj_dane(macierz,rozmiar);
        matrix.przetworz_dane(macierz,rozmiar);
        matrix.wyswietl_dane(macierz,rozmiar);
    }
}
