import java.util.Scanner;

public class RecursiveFibonacci {
    static int fibo(int a){

        if (a==1 || a==2){
            return 1;
        }
            
        return fibo(a-1)+fibo(a-2);

    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaçıncı değeri öğrenmek istiyorsunuz? ");
        int a =inp.nextInt();
        System.out.println(fibo(a));
        
    }
    
}
