import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;

        System.out.print("Bir sayı giriniz: ");
        a=inp.nextInt();

        int top=0;
        for (int i=1; i<a;i++){
            if (a%i==0){
                top+=i;

            }
        }

        if (top==a){
            System.out.println(a + " sayısı Mükemmel sayıdır.");

        }else{
            System.out.println(a + " sayısı Mükemmel sayı değildir.");
        }

    }
    
}
