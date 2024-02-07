import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int km,start=10;
double perKm=2.20,totalPrice;


        System.out.println("Kaç km gideceğinizi giriniz...");
        km=input.nextInt();
        totalPrice=start+km*perKm;
        totalPrice=(totalPrice<20)?20:totalPrice;
        System.out.println("Ödenecek tutar="+totalPrice);

    }
}