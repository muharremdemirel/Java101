import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b,buyuk = 0,kucuk = 0;

        System.out.print("Birinci sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextInt();

        if (a>b){
            buyuk =a;
            kucuk=b;

        }else if (b>a){
            buyuk=b;
            kucuk=a;

        }

        int i=1,s=0;
        while ( i <= kucuk){
            if (a%i==0 && b%i==0){
                s=i;
                i++;
            }else{
                i++;
            }
        

        }
        System.out.println("EBOB: " + s);
        int c =1;
        c=kucuk;
        while(c<=(a*b)){
            if (c%kucuk==0 && c%buyuk==0){
                System.out.println("EKOK: " + c);
                break;

            }else{
                c++;
            }
            

        }
    }
    
}
