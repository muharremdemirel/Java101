import java.util.Scanner;

public abstract class BiletFiyati {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int km,yas;
        byte tip;
        double toplam,kmbasi=0.1;
        
        System.out.print("Mesafeyi giriniz: ");
        km = inp.nextInt();

        System.out.print("Yaşı giriniz: ");
        yas = inp.nextInt();

        System.out.print("Yolculuk türünü giriniz. Tek yön ise --> 1 Gidiş-Dönüş ise --> 2 yazınız: ");
        tip = inp.nextByte();

        toplam = (km * kmbasi);

        if (yas < 12){
            toplam *= 0.5;
        }
        else if (yas >= 12 && yas <= 24){
            toplam *= 0.9;
        }
        else if (yas > 65){
            toplam *= 0.7;
        }


        if (tip == 1){
            toplam = toplam;
            System.out.print(toplam);
    
       }else if (tip ==2){
            toplam *= 0.8;
            toplam *= 2;
            System.out.print(toplam);
       }

        if (km<0){
            System.out.print("Hatalı veri girdiniz..");

       } else if (yas<0){
            System.out.print("Hatalı veri girdiniz..");

        
       }else if ((tip == 1) || (tip == 2)){
        System.out.print("");

       }else {
        
        System.out.print("Hatalı veri girdiniz..");
       }

    
       
    }
    
}
