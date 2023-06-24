import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) throws Exception {
        
        Scanner imp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz?  ");
        int n = imp.nextInt();
        boolean first = true;
        int min = 0, max = 0;


        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int a = imp.nextInt();

            if (first == true) {
                min = a;
                max = a;
                first = false;
            } else {
                if (a < min)
                    min = a;
                if (a > max)
                    max = a;
            }
        }
        System.out.println("Minimum değer: " + min);
        System.out.println("Maximum değer: " + max);
        
    }
}