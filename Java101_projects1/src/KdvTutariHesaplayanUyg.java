import java.util.Scanner;

public class KdvTutariHesaplayanUyg {
    public static void main(String[] args) {
        System.out.println("Welcome to App2 !");

        double kdv = 0.18 , kdv2 = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı giriniz :");
        int tutar = input.nextInt();

        double toplamKdv = (tutar > 1000) ? tutar * kdv : tutar * kdv2;

        System.out.println("Tutar : " + tutar);
        System.out.println("Kdv Oranı : " + kdv);
        System.out.println("Kdvsiz Tutar : " + (tutar-toplamKdv));
        System.out.println("Toplam Kdv : " + toplamKdv);

    }
}
