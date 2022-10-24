import java.util.Scanner;

public class DaireninAlanVeCevresi {
    public static void main(String[] args) {
        System.out.println("Welcome to App5 !");

        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        double alan ,cevre,dairedilAlan;

        System.out.println("yarıçapı giriniz: " );
        double r = input.nextDouble();

        alan = pi*r*r;
        System.out.println("Dairenin Alanı : " + alan);
        cevre = 2*pi*r;
        System.out.println("Dairenin Çevresi : " + cevre);

        System.out.println("Daire dilimini giriniz: " );
        double a = input.nextDouble();
        dairedilAlan =  (pi * (r*r) * a) / 360;
        System.out.println("Daire  merkez açısının ölçüsü" + a +  "olan daire diliminin alanı: " + dairedilAlan);





    }
}
