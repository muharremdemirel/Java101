import java.util.Scanner;

public class BolenOrtalamasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,top = 0, adet = 0;

        System.out.println("Bir sayı giriniz: ");
        x = inp.nextInt();
         for (int i = 0; i<=x;i++){
            if (i%3 ==0 && i%4==0){
                top+=i;
                adet++;
            }
         }
         System.out.print("0 dan " + x + " sayısına kadar olan sayılardan 3'e ve 4'e tam bölünenlerin ortalaması: "+ (top/adet));
        
    }
    
}
