import java.util.Scanner;

public class Kuvvet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;

        System.out.print("Kaça kadar sorgulamak istiyorsunuz: ");
        b = inp.nextInt();
        System.out.println(" ");

        System.out.println(b + "  sayısına kadar olan sayılardan 4'ün kuvvetleri: ");
        for (a=1;a<=b;a*=4){
            System.out.println(a);
        }
        System.out.println(" ");
        System.out.println(b + " sayısına kadar olan sayılardan 5'in kuvvetleri: ");

        for (a=1;a<=b;a*=5){
            System.out.println(a);
        }


        }            
            
}  




