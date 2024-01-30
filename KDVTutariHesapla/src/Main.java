import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);

        System.out.println("Liütfen kdv hesaplatmak istediğiniz tutarı giriniz..");

        int deger=input.nextInt();
       double kdvTutar= deger <1000? deger*0.18 +deger:deger*0.08+deger;

        System.out.println(kdvTutar+"kdvli");
        System.out.println(deger+"kdvsiz");
        System.out.println(deger <1000? 0.18 :0.08+"kdv");
    }
}