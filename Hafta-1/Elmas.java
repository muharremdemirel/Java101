import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;

        System.out.println("Bir sayı giriniz: ");
        a = inp.nextInt();

        for (int i = 1; i<=a; i++){
            for (int k =1; k<= (a-i); k++ ){
                System.out.print(" ");

            }
            for (int j=1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a; i>=1;i--){
            for (int k = 1; k<=(a-i); k++){
                System.out.print(" ");
            }
            for (int j= 1; j<=(2*i) - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
