import java.util.Scanner;

public class VucutKitleEndeksHesaplama {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Kilo (kg) / Boy(m) * Boy(m)
        */

        double kilo;
        double boy;
        double indeks;

        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan boy ve kilosunu alıyoruz.
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scan.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();

        //formülü hesaplama
        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
    }
}
