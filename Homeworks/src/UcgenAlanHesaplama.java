import java.util.Scanner;

public class UcgenAlanHesaplama {

    public static void main(String[] args) {
    //Kullanıcıdan üçgenin kenarlarını ondalıklı sayı olarak alıyoruz.
    double kenar1, kenar2, kenar3;
    double u;
    double alan;
    Scanner scan = new Scanner(System.in);

    //Kullanıcıdan fiyat alıyoruz
    System.out.print("1. Kenarı giriniz : ");
    kenar1 = scan.nextFloat();

    System.out.print("2. Kenarı giriniz : ");
    kenar2 = scan.nextFloat();

    System.out.print("3. Kenarı giriniz : ");
    kenar3 = scan.nextFloat();

    //Formül Hesaplama
    u = (kenar1 + kenar2 + kenar3) / 2;
    alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
    System.out.println("Üçgenin alanı : " + alan);

}

}
