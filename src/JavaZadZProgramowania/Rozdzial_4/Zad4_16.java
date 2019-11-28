package JavaZadZProgramowania.Rozdzial_4;

public class Zad4_16 {
    public static void main(String[] args) {

        int n = 100;
        int  suma_p = 0;
        int suma_np = 0;

        int dane[] = new int [n];

        for (int i = 1;i<=dane.length;i++){
            dane[i-1] = i;
        }
        for (int x :dane){
            if (x%2==0){
                 suma_p+=x;
            }else{
                 suma_np+=x;
            }
        }
        System.out.println("Suma liczb parzystych od 1 do 100 jest rowna = " +  suma_p);
        System.out.println("Suma liczb nie parzystych od 1 do 100 jest rowna = " +  suma_np);


    }
}
