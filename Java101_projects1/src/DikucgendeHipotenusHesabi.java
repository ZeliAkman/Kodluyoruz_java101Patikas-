import java.util.Scanner;
public class DikucgendeHipotenusHesabi {
    public static void main(String[] args) {
        System.out.println("Welcome to App3 !");
        /* değişkenlerimiz */
        int a,b;
        double c,u,cevre,alan;
        /* kullanıcıdan veri alma  */
        Scanner input = new Scanner(System.in);

        System.out.println("Dik kenarı giriniz : ");
        a = input.nextInt();

        System.out.println("Komşu kenarı giriniz : ");
        b = input.nextInt();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs değerimiz : " + c);

        u = (a+b+c)/2 ;

        cevre = 2*u;
        System.out.println("Üçgenin Çevresi : "+cevre);

        alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin alanı : "+alan);

    }
}
