import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,sonuc;
        int kg;

Scanner input =new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz..");
        boy=input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz..");
        kg=input.nextInt();

        sonuc = kg/(boy*boy);

        System.out.println("Vücut kitle indeksiniz="+sonuc);
    }
}
