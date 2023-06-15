import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int s;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz: ");
        s = inp.nextInt();


        if (s < 5) {
            System.out.println("Kayak yapabilirsin.");

        }else if (s <= 25) {
            if (s <= 15){
                System.out.println("Simemaya gidebilirsin.");

            }
            if (s >= 15) {
                System.out.print("Pikniğe gidebilirsin.");


            }


        } else {
            System.out.print("Yüzmeye gidebilirsin.");
        }

        
    }
    
}
