import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,m;
        boolean asalmi;

        System.out.println("1-100 arası asal sayılar: ");

        for (n=2;n<=100;n++){
            asalmi=true;

            for (m=2;m<n;m++){
                if (n%m == 0){
                    asalmi=false;
                    break;
                }
            }
            if ((asalmi)){
                System.out.println(n + " ");
            }

        }

        
        
        
    }    
}
