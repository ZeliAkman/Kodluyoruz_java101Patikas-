import java.util.Scanner;

public class ManavKasaUygulamasi {
    public static void main(String[] args) {
        System.out.println("Welcome to App7 !");

        Scanner input = new Scanner(System.in);
        double armutk,elmak,domatesk,muzk,patlicank,armuta,elma,domatesa,muza,patlicana,toplam;

        System.out.println(" Kaç kilo armut alındı  ?  ");
        armutk=input.nextDouble();

        System.out.println("Kaç kilo elma alındı ? ");
        elmak=input.nextDouble();

        System.out.println("Kaç kilo domates alındı ? ");
        domatesk=input.nextDouble();

        System.out.println(" Kaç kilo muz alındı ? ");
        muzk=input.nextDouble();

        System.out.println("Kaç patlican alındı ? ");
        patlicank=input.nextDouble();

        armuta=(armutk*2.14);
        elma=(elmak*3.67);
        domatesa=(domatesk*1.11);
        muza=(muzk*0.95);
        patlicana=(patlicank*5.00);

        toplam = armuta + elma + domatesa+muza+ patlicana;

        System.out.println("Toplam Ödenecek Tutar : "+toplam);

    }
}
