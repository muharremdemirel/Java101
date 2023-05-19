import java.util.Scanner;

import javax.print.event.PrintEvent;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullaniciAdi,sifre,sifreSıfırlama,yeniSifre;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınzı giriniz: ");
        kullaniciAdi = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre = inp.nextLine();

        if (kullaniciAdi.equals("patika") && sifre.equals("java")){
            System.out.println("Sisteme başarıyla giriş yaptınız.");

        }else {
            
            if ( kullaniciAdi.equals("patika") && (sifre != "java")) {
                System.out.println("Şifreniz hatalı...");

                System.out.println("Şifrenizi sıfırlamak için aşağıdaki butona EVET yazın...");
                sifreSıfırlama = inp.nextLine();

                if (sifreSıfırlama.equals("EVET")){
                    System.out.println("Yeni şifreniz yazınız: ");
                    yeniSifre=inp.nextLine();

                    if (yeniSifre.equals("java")){
                        System.out.println("Şifre oluşturulamadı. Ana sayfaya yönlendiriliyor...");
                    
                    }else { 
                        System.out.print("Şifre başarılı bir şekilde değiştirildi.");
                    } 

                }else{
                    System.out.print("Hatalı giriş yaptınız. Ana sayfaya yönlendiriliyorsunuz...");
                }
            
            }
        }

    }   
    
}
