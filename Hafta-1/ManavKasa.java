import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args){
        double kgarmut = 2.14,kgelma = 3.67,kgdomates = 1.11,kgmuz= 0.95,kgpatlıcan = 5.00,tutar;
        int a,b,c,d,e;

        Scanner inp=new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        a = inp.nextInt();

        System.out.print("Elma kaç kilo: ");
        b = inp.nextInt();

        System.out.print("Domates kaç kilo: ");
        c = inp.nextInt();

        System.out.print("Muz kaç kilo: ");
        d = inp.nextInt();

        System.out.print("Patlıcan kaç kilo: ");
        e = inp.nextInt();


        tutar = (kgarmut*a) + (kgelma*b) + (kgdomates*c) + (kgmuz*d) + (kgpatlıcan*e);
        System.out.print("Toplam Tutar: "+ tutar);

    }

}
