import java.util.Scanner;

public class DersOrtalamaHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, toplamNot = 0, girilenDersNotu = 0;

        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan notları tamsayı olarak al
        System.out.print("Matematik Notu: ");
        mat = scan.nextInt();
        if(mat > 0 && mat <=100)
        {
            toplamNot += mat;
            girilenDersNotu++;
        }

        System.out.print("Fizik Notu: ");
        fizik = scan.nextInt();
        if(fizik > 0 && fizik <=100)
        {
            toplamNot += fizik;
            girilenDersNotu++;
        }

        System.out.print("Kimya Notu: ");
        kimya = scan.nextInt();
        if(kimya > 0 && kimya <=100)
        {
            toplamNot += kimya;
            girilenDersNotu++;
        }

        System.out.print("Türkçe Notu: ");
        turkce = scan.nextInt();
        if(turkce > 0 && turkce <=100)
        {
            toplamNot += turkce;
            girilenDersNotu++;
        }

        System.out.print("Tarih Notu: ");
        tarih = scan.nextInt();
        if(tarih > 0 && tarih <=100)
        {
            toplamNot += tarih;
            girilenDersNotu++;
        }

        System.out.print("Müzik Notu: ");
        muzik = scan.nextInt();
        if(muzik > 0 && muzik <=100)
        {
            toplamNot += muzik;
            girilenDersNotu++;
        }

        //Ortalamanın hesaplandığı kısım
        int ortalama = toplamNot / girilenDersNotu;
        if(ortalama >= 55)
        {
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }
        else
        {
            System.out.println("Sınıfta kaldınız!");
        }
        System.out.println("Ortalamanız : " + ortalama);
    }
}
