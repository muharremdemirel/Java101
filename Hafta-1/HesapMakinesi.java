import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a, b;
        int select;

        System.out.print("Birinci sayıyı giriniz: ");
        a = inp.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextDouble();
        
        System.out.println("**************");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("**************");
        System.out.println("");
        System.out.println("Seçiminiz: ");

        select = inp.nextInt();
       
        switch (select) {
             case 1:
                 System.out.println("Sonuç: " + (a+b));
                 break;
             case 2:
                 System.out.println("Sonuç: " + (a-b));
                 break;
             case 3:
                 System.out.println("Sonuç: " + (a*b));
                 break;
             case 4:
                 if (b==0)
                     System.out.println("Bölen değer  0 olamaz...");
                 else
                     System.out.println("Sonuç: " + (a/b));
                 break;
             default:
                 System.out.println("Hatalı giriş...");
                 
        
         }
        

    }
}