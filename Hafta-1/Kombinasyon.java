import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,r,i,x,nn=1,rr=1,xx=1,sonuc;

        System.out.println("Küme kaç elemanlı? ");
        n = inp.nextInt();

        System.out.println("Kaç elemanlı farklı grup olmalı? ");
        r = inp.nextInt();

        x = (n-r);
        int total = 1;

        for (i=1; i<=n ;i++){
            nn *= i;

        }
        for (i=1; i<=r;i++){
            rr *=i;
        }
        for (i=1;i<=x;i++){
            xx *=i;
        }
        sonuc = (nn / (rr * xx));
        System.out.println(sonuc);

        
        
        
        


        
    }
    
}
