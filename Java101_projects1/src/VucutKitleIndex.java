import java.util.Scanner;
public class VucutKitleIndex {
    public static void main(String[] args) {
        System.out.println("Welcome to App6 !");

        Scanner input = new Scanner(System.in);
        double boy ,kilo,index ;

        System.out.println("lütfen boyunuzu ( metrecinsinden ) giriniz : ");
        boy = input.nextDouble();

        System.out.println("lütfen kilonuzu  giriniz : ");
        kilo = input.nextDouble();

        index =kilo / (boy * boy);
        System.out.println("Vücut kitle İndexsiniz : "+ index);

    }
}
