import java.util.Scanner; // import scanner library

public class NotOrtalamasi {
    public static void main(String[] args) {
        System.out.println("Welcome to App !");
        Scanner input = new Scanner(System.in);// explain class
        int mat,fiz,kim,turk,tar,muzik ;

        System.out.println("Lütfen Matematik notunuzu giriniz :");
        mat= input.nextInt();

        System.out.println("Lütfen Fizik notunuzu giriniz :");
        fiz= input.nextInt();

        System.out.println("Lütfen Kimya notunuzu giriniz :");
        kim= input.nextInt();

        System.out.println("Lütfen Türkçe notunuzu giriniz :");
        turk= input.nextInt();

        System.out.println("Lütfen Tarih notunuzu giriniz :");
        tar= input.nextInt();

        System.out.println("Lütfen Müzik notunuzu giriniz :");
        muzik= input.nextInt();

        int top = (mat+fiz+kim+turk+tar+muzik);
        Double sonuc = top/6.0;
        System.out.println("Ortalamanız :"+sonuc);

        String kosul = (sonuc >= 60) ? "Sınıfı Geçtiniz! Tebrikler" : "Sınıfta Kaldınız!";
        System.out.print(kosul);









    }
}
