import java.util.Scanner;
public class DaireAlanÇevre {
    public static void main(String[] args){
        double pi = 3.14,r,a,alan;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçap değerini giriniz: ");
        r = inp.nextDouble();
        System.out.print("Merkez açının ölçüsünü giriniz: ");
        a = inp.nextDouble();
        alan = (pi * (r*r) * a) / 360;
        System.out.print("Dairenin alan: " + alan);

    }
    
}
