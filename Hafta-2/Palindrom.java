import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int numara){
        int tmp = numara, yeniNumara=0, sonSayi;
        while(tmp != 0){

            sonSayi = tmp % 10;
            yeniNumara = (yeniNumara * 10) + sonSayi;
            tmp/=10;
        }

        if (numara ==yeniNumara)
            return true;
        else 
            return false;
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(3547));
        
        
    }
    
}
