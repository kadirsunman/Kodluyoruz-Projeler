import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        double hesaplananTutar;

        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan kilogramları istiyoruz

        System.out.print("Armut Kaç Kilo ? : ");
        armut *= scan.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elma *= scan.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domates *= scan.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muz *= scan.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican *= scan.nextDouble();

        //Kg la fiyatları çarptıktan sonra topluyoruz.
        hesaplananTutar = armut + elma + domates + muz + patlican;
        System.out.println("Toplam Tutar : " + hesaplananTutar + "₺");

    }
}
