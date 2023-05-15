import java.security.DrbgParameters.NextBytes;

import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        
        double total,perKm = 2.20,tutar;
        int km;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yolculuk kaç km sürdü?: ");
        km = inp.nextInt();

        total = (km * perKm )+ 10;

        boolean kontrol = (10 < total) && (total < 20);
        tutar = kontrol ? total=20 : total;

        System.out.print("Ödemeniz gereken tutar: " + tutar);









    }
    
}
