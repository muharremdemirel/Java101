import java.util.Scanner;
public class VKI {
    public static void main(String[] args){

        double kilo,boy;
        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        double vkı = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: " + vkı);



    }
    
}
