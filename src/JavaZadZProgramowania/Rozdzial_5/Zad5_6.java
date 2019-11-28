package JavaZadZProgramowania.Rozdzial_5;

public class Zad5_6 {
    public static int triangle(int n){
        if (n== 1){
            return 1;
        }else{
            return (n + triangle(n -1));
        }
    }

    public static void main(String[] args) {
        int i, n = 10;
        Zad5_6 liczby = new Zad5_6();
        System.out.println("Program znajduje 10 pierwszych liczb trojkatnych ");
        for (i=1; i<= n; i++){
            System.out.println(i + "#= " + liczby.triangle(i) );
        }
    }
}
