import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        double top=0;

        System.out.println("Bir sayı giriniz: ");
        a = inp.nextInt();

        for (double i = 1;i<=a;i++){
            top += (1/i);
        }
        System.out.println("Girdiniz değer göre oluşan Harmonik Seri sonucu: " + top);
    }
    
}
