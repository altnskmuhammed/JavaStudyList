import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,chose;
        double sonuc=0;


        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz \n1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme");
        Scanner input=new Scanner(System.in);
        chose=input.nextInt();
        System.out.print("Lütfen ilk rakamı giriniz:");
        n1=input.nextInt();
        System.out.print("Lütfen ikinci rakamı giriniz:");
        n2=input.nextInt();

        switch (chose){
            case 1:
                sonuc=n1+n2;
                break;
            case 2:
                sonuc=n1-n2;
                break;
            case 3:
                sonuc=n1*n2;
                break;
            case 4:
                if(n2 !=0){
                    sonuc=n1/n2;
                }else System.out.println("İkinci rakam sıfır olamaz");
                break;
            default:
                System.out.println("Yanlış seçim");
        }

        System.out.println("Sonuç="+sonuc);

    }
}
