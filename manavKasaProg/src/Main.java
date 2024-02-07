import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Armut = 2.14 ,Elma = 3.67 ,Domates = 1.11 , Muz= 0.95 , Patlican = 5.00 ;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,toplamFiyat;


        Scanner input = new Scanner(System.in);
        System.out.println("Armut kac kg?");
        armutKg=input.nextDouble();
        System.out.println("Elma kac kg?");
        elmaKg=input.nextDouble();
        System.out.println("Domates kac kg?");
        domatesKg=input.nextDouble();
        System.out.println("Muz kac kg?");
        muzKg=input.nextDouble();
        System.out.println("Patlıcan kac kg?");
        patlicanKg=input.nextDouble();

        toplamFiyat=armutKg*Armut+elmaKg*Elma+domatesKg*Domates+muzKg*Muz+patlicanKg*Patlican;

        System.out.println("Toplam fiyat="+toplamFiyat);

    }
}