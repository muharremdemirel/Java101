import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b=0;

        System.out.print("Kaç satırlık üçgen olmasını istersiniz: ");
        a = inp.nextInt();

         for (int i =a; i >= 1; i--) {
            for (int j = 0; j <a- i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    
        
    }
    
    
}
