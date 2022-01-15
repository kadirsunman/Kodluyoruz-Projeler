import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        //Kullanıcıdan üçgenin kenarlarını ondalıklı sayı olarak alıyoruz.
        double girilenKM;
        double fiyat;

        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan fiyat alıyoruz
        System.out.print("KM giriniz : ");
        girilenKM = scan.nextDouble();

        fiyat = 10 + girilenKM * 2.2;
        if(fiyat < 20)
        {
            fiyat = 20;
        }

        System.out.println("Hesaplanan tutar : " + fiyat + "₺");
    }
}
