import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        int top = 0;

        do {
            System.out.print("Bir sayı giriniz: ");
            a = inp.nextInt();
            if (a%4 ==0 ){
                top +=a;
            }
            
        }
        while (a%2 ==0);

        System.out.println("Sonuç: " + top);
    }
    
}
