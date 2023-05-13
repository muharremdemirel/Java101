import java.util.Scanner;
public class NotOrtalaması {
    public static void main(String[] args) {
        int matematik,turkce,fizik,kimya,biyoloji,muzik,tarih;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = inp.nextInt();
        
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
    
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        
        System.out.print("Biyoloji Notunuz: ");
        biyoloji = inp.nextInt();
        
        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();
        
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        int toplam = (matematik + turkce + fizik + kimya + biyoloji + muzik + tarih);
        double ortalama = toplam/7;

        System.out.println("Not Ortalamanız: " + ortalama);
        
        String sonuc = (ortalama > 60) ? "Geçtiniz" : "Kaldınız";
        System.out.print("Sonuç: " + sonuc);

        

        

    }
}