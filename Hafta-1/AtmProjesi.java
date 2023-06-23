import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a,b, kullaniciAdi = "Muharrem",sifre = "Demirel";
        int girisHakki = 3,bakiye=5000,islem;

        while (girisHakki > 0){


            System.out.println("Kullanıcı adını giriniz: ");
            a = inp.nextLine();

            System.out.println("Şifrenizi giriniz: ");
            b = inp.nextLine();



            if (a.equals(kullaniciAdi) && b.equals(sifre)){

                System.out.println("Hoşgeldiniz :) ");
                do { 
                    System.out.println( "1-Para Yatır\n" +  "2-Para Çek\n" + "3-Bakiye Sorgulama\n" + "4-Çıkş");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    islem = inp.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.println("Para miktarı: ");
                            int price= inp.nextInt();
                            bakiye +=price;
                        break;
                        case 2:
                            System.out.println("Para miktarı: ");
                            int miktar= inp.nextInt();
                            if (miktar>bakiye){
                                System.out.println("Bakiye yetersiz...");

                            }else{
                                bakiye -=miktar;
                            }
                            
                        break;
                        case 3:
                            System.out.println("Hesabınızdaki miktar: " + bakiye);
                        break;
                        
                    }

                } while (islem !=4);
                    System.out.println("Hoşçakalın :)");
                    break;

            }else {
                girisHakki--;
                System.out.println("Hatalı giriş denemesi!...");
                if (girisHakki == 0){
                    System.out.println("Hesabınız bloke olmuştur... ");

                }else{
                    System.out.println("Kalan hakkınız:" + girisHakki);
                }
                
            }

        }

    }
    
}
