import java.net.Socket;
import java.util.Scanner;

public class ÜslüSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         int a,b,sonuc=1;

         System.out.println("Taban: ");
         a = inp.nextInt();

         System.out.println("Üs: ");
         b = inp.nextInt();

         for (int i = 1; i<=b;i++){
            sonuc *=a ;
         }

         System.out.println(sonuc);

    }
}
