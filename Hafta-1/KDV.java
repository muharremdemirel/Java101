import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double tutar,kdv,kdvTutari,kdvliTutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Tutarı Giriniz: ");
        tutar = inp.nextDouble();

        boolean kdvOrani = (0 < tutar) && (tutar < 1000);
        kdv = kdvOrani ? 0.18 : 0.08 ;
        kdvTutari = tutar * kdv ;
        kdvliTutar = tutar + kdvTutari ;

        System.out.println("Ürün Fiyatı: " + tutar);
        System.out.println("KDV Oranı: " + kdv);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliTutar);






    } 
    
}
