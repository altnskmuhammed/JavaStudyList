import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner girdi =new Scanner(System.in);
        System.out.println("1.kenarı giriniz..");
        a=girdi.nextInt();
        System.out.println("2.kenarı giriniz..");
        b=girdi.nextInt();
        System.out.println("3.kenarı giriniz..");
        c=girdi.nextInt();

        double cevre=(a+b+c)/2;
        double alan = cevre*(cevre-a)*(cevre-b)*(cevre-c);
        System.out.println("Girdiginiz üçgenin alanı="+alan);
    }
}