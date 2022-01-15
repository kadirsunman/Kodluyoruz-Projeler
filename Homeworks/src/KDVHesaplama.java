import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        //Kullanıcıdan alınan fiyatı ve hesaplama yapmak için birer ondalıklı değişken tanımlıyoruz
        float girilenFiyat;
        float hesaplananFiyat;

        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan fiyat alıyoruz
        System.out.print("Fiyat Giriniz : ");
        girilenFiyat = scan.nextFloat();

        //Hesaplama bölümü
        if(girilenFiyat > 0 && girilenFiyat < 1000)
        {
            hesaplananFiyat = girilenFiyat + (girilenFiyat * 0.18f);
        }
        else
        {
            hesaplananFiyat = girilenFiyat + (girilenFiyat * 0.08f);
        }
        System.out.println("Kdv'li hesaplanan tutar : " + hesaplananFiyat + "₺");

    }
}
