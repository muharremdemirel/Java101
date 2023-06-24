import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int c,d=2,e=0;
        System.out.println("Kaç elemanlı Fibonacci dizisi istiyorsunuz: ");
        c=inp.nextInt();
        
        int a=0;
        int b=1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        while (d<c){
            e=a+b;
            a=b;
            b=e;
            System.out.print(e + " ");
            d++;

        }
        


    }    
}
