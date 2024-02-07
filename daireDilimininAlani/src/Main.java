import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int yaricap,merkezAci;
double sonuc , pi=3.14;

        Scanner input =new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz..");
        yaricap=input.nextInt();
        System.out.print("Yarıçapını girdiğiniz dairenin merkez açısını giriniz..");
        merkezAci=input.nextInt();

        sonuc=(pi*(yaricap*yaricap)*merkezAci)/360;

        System.out.println("girdiğiniz değerlere sahip daire diliminin alanı "+sonuc);

    }
}