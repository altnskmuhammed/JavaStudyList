import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int mat,fiz,kim,tar;
System.out.print("Matematik notunuzu giriniz");
        mat=input.nextInt();
        System.out.print("Kimya notunuzu giriniz");
        kim=input.nextInt();
        System.out.print("Fizik notunuzu giriniz");
        fiz=input.nextInt();
        System.out.print("Tarih notunuzu giriniz");
        tar=input.nextInt();


        double ort = (kim+fiz+mat+tar)/4;
        System.out.println(ort>=50?"Geçtiniz":"Kaldınız");
    }
}