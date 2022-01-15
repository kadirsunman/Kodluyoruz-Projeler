import java.util.Scanner;

public class FirstHomeworks {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan notları tamsayı olarak al
        System.out.print("Matematik Notu: ");
        mat = scan.nextInt();

        System.out.print("Fizik Notu: ");
        fizik = scan.nextInt();

        System.out.print("Kimya Notu: ");
        kimya = scan.nextInt();

        System.out.print("Türkçe Notu: ");
        turkce = scan.nextInt();

        System.out.print("Tarih Notu: ");
        tarih = scan.nextInt();

        System.out.print("Müzik Notu: ");
        muzik = scan.nextInt();

        //Ortalamanın hesaplandığı kısım
        int ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println(ortalama);

    }
}
