import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int ay,gun;
        

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        ay = inp.nextInt();

        System.out.print("Doğduğunuz gün: ");
        gun = inp.nextInt();

        if (ay == 1) {
            if (1 <= gun && 31 >= gun) {
                if (gun < 22){
                    System.out.print("Oğlak Burcu");
                } else {
                    System.out.print("Kova Burcu");
                }
            }

        } else if (ay == 2) {
            if (1 <= gun && 29 >= gun) {
                if (gun < 19){
                    System.out.print("Kova Burcu");
                } else {
                    System.out.print("Balık Burcu");
                }
            }

        }if (ay == 3) {
            if (1 <= gun && 31 >= gun) {
                if (gun < 20){
                    System.out.print("Balık Burcu");
                } else {
                    System.out.print("Koç Burcu");
                }
            }

        }if (ay == 4) {
            if (1 <= gun && 30 >= gun) {
                if (gun < 20){
                    System.out.print("Koç Burcu");
                } else {
                    System.out.print("Boğa Burcu");
                }
            }

        }if (ay == 5) {
            if (1 <= gun && 31 >= gun) {
                if (gun < 21){
                    System.out.print("Boğa Burcu");
                } else {
                    System.out.print("İkizler Burcu");
                }
            }

        }if (ay == 6) {
            if (1 <= gun && 30 >= gun) {
                if (gun < 22){
                    System.out.print("İkizler Burcu");
                } else {
                    System.out.print("Yengeç Burcu");
                }
            }

        }if (ay == 7) {
            if (1 <= gun && 31 >= gun) {
                if (gun < 22){
                    System.out.print("Yengeç Burcu");
                } else {
                    System.out.print("Aslan Burcu");
                }
            }

        }if (ay == 8) {
            if (1 <= gun && 31 >= gun) {
                if (gun < 22){
                    System.out.print("Aslan Burcu");
                } else {
                    System.out.print("Başak Burcu");
                }
            }

        }if (ay == 9) {
            if (1 <= gun && 30 >= gun) {
                if (gun < 22){
                    System.out.print("Başak Burcu");
                } else {
                    System.out.print("Terazi Burcu");
                }
            }

        }if (ay == 10) {
            if (1 <= gun && 31 >= gun) {
                if (gun < 22){
                    System.out.print("Terazi Burcu");
                } else {
                    System.out.print("Akrep Burcu");
                }
            }

        }if (ay == 11) {
            if (1 <= gun && 30 >= gun) {
                if (gun < 21){
                    System.out.print("Akrep Burcu");
                } else {
                    System.out.print("Yay Burcu");
                }
            }

        }if (ay == 12) {
            if (1 <= gun && 31 >= gun) {
                if (gun < 21){
                    System.out.print("Yay Burcu");
                } else {
                    System.out.print("Oğlak Burcu");
                }
            }

        }


    }
}
    

