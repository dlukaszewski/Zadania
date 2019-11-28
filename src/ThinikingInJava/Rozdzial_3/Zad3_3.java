package ThinikingInJava.Rozdzial_3;


public class Zad3_3 {
        static class Tank{
            float f;
        }

            static void d(Tank y){
                y.f = 10;
            }

        public static void main(String[] args) {

            Tank t1 = new Tank();
            Tank t2 = new Tank();
            Tank x = new Tank();

            x.f = 30;
            t1.f = 9;
            t2.f = 50;

            System.out.println("t1.f = " + t1.f);
            System.out.println("t2.f = " + t2.f);
            t1 = t2;
            System.out.println("t1.f = " + t1.f);
            System.out.println("t2.f = " + t2.f);
            t1.f = 15;
            System.out.println("t1.f = " + t1.f);
            System.out.println("t2.f = " + t2.f);

            System.out.println("x.f = " + x.f);
            d(x);
            System.out.println("d(x)  = " + x.f);
        }
    }

