import java.util.Scanner;

public class TaksimetreHesabi {
    public static void main(String[] args) {
        System.out.println("Welcome to App4 !");
        double Topucret;
        double KmTaksi = 2.20;
        double acilisucret= 10;
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç KM yol gidilecek : ");
        double yol = input.nextDouble();

        Topucret = acilisucret + KmTaksi * yol;
        System.out.println("Ödenecek ücret : "+Topucret);







    }
}
