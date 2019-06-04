package lab2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum result is: " + adunare(2,3));
        System.out.println("Rezultatul scaderii este: " + scadere(452,47));
        System.out.println("Rezultatul inmultirii este: " + inmultire(5,5));
        System.out.println("Rezultatul impartirii este: " + impartire(10,2));
        System.out.println("media numerelor este: " + mediaNumerelor(20,39, 75));
        System.out.println("temperatura este: " + temperatura(92));

    }

    public static int adunare(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;

    } public static int scadere(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar - alDoileaNumar;

        return rezultat;
    }

        public static int inmultire(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar * alDoileaNumar;

        return rezultat;
    }

        public static int impartire(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar / alDoileaNumar;

        return rezultat;
    }

    public static int mediaNumerelor(int a, int b, int c) {
        int rezultat=a+b+c/3;
        return rezultat;
    }

    public static double temperatura(int grade) {
        double temp=  5/9 * (grade -32);
                return temp;


        }


    }















