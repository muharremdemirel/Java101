import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b=0,c,top=0,tempa;


        System.out.print("Bir sayı giriniz: ");
        a = inp.nextInt();
        tempa = a ;
        while (tempa>0) {
            tempa = tempa/10;
            b++;
        }

        for (int i = 1; i<=b;i++){
            c = a % 10;
            a /=10;
            top +=c;
        }
        System.out.println(top);

    }

}
