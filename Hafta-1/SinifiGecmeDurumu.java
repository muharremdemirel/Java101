import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat,turkce,kimya,fizik,muzik;
        double sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int notToplami=0 ,notSayisi=0;

        if (mat >= 0 && mat <= 100) {
            notToplami += mat;
            notSayisi++;
        }
        if (turkce >= 0 && turkce <= 100) {
            notToplami += turkce;
            notSayisi++;
        }
        if (fizik >= 0 && fizik <= 100) {
            notToplami += fizik;
            notSayisi++;
        }
        if (kimya >= 0 && kimya <= 100) {
            notToplami += kimya;
            notSayisi++;
        }
        if (muzik >= 0 && muzik <= 100) {
            notToplami += muzik;
            notSayisi++;
        }
        
        sonuc = notToplami/notSayisi;
        System.out.println("Ortalamaya katılan dersler ile beraber not ortalamanız: " + sonuc);
        if (sonuc < 55){
            System.out.print("Sınıfta Kaldınız :( ");
        }else {
            System.out.print("Bir Üst Sınıfa Geçtiniz :)");
        }

    }
    
}
 