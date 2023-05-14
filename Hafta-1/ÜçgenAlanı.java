import java.util.Scanner;

public class ÜçgenAlanı {
    public static void main(String[] args){
        double a,b,c,ucgenCevresi,ucgenAlani,u;
        Scanner inp=new Scanner(System.in);

        System.out.print("Birinci Kenarı Giriniz: ");
        a = inp.nextDouble();

        System.out.print("İkinci Kenarı Giriniz: ");
        b = inp.nextDouble();

        System.out.print("Üçündü Kenarı Giriniz: ");
        c = inp.nextDouble();

        ucgenCevresi = (a+b+c);
        u = ucgenCevresi / 2;
        ucgenAlani = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin çevresi: " + ucgenCevresi );
        System.out.print("Üçgenin alanı: " + ucgenAlani);

    }
}
