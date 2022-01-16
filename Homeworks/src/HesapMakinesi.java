import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int select;

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        n1 = scan.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = scan.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiminiz : ");
        select = scan.nextInt();
        switch (select)
        {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölüm : " + (n1 / n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz!");
                break;
        }

    }
}
