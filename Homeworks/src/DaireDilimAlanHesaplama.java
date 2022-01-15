import java.util.Scanner;

public class DaireDilimAlanHesaplama {
    public static void main(String[] args) {
        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
        */

        double r;
        double a;
        double pi = 3.14;
        double alan;

        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan yarıçap ve merkez açısının ölçüsünü alıyoruz.
        System.out.print("Yarıçapı giriniz : ");
        r = scan.nextDouble();

        System.out.print("Merkez açı ölçüsünü giriniz : ");
        a = scan.nextDouble();

        //formülü hesaplama

        alan = (pi * (r * r) * a) / 360;
        System.out.println("Dilimin alana : " + alan);
    }
}
