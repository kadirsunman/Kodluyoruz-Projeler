import java.util.Scanner;

public class SignInProgrami {
    public static void main(String[] args) {
        String registerUserName = "deneme";
        String registerPassword = "password";
        String userName, password;
        String select;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = scan.nextLine();

        System.out.print("Şifreniz : ");
        password = scan.nextLine();

        if(userName.equals(registerUserName) && password.equals(registerPassword))
        {
            System.out.println("Giriş başarılı hoşgeldiniz " + userName);
        }
        else
        {
            System.out.println("Şifreniz hatalı. Şifrenizi sıfırlamak ister misiniz?\nE-Evet\nH-Hayır");
            System.out.print("Cevabınız : ");
            select = scan.nextLine();
            if(select.equals("E"))
            {
                while(true)
                {
                    System.out.print("Yeni şifre giriniz : ");
                    password = scan.nextLine();
                    if(password.equals(registerPassword))
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else
                    {
                        registerPassword = password;
                        System.out.println("Şifre oluşturuldu");
                        break;
                    }
                }

            }
            else if(select.equals("H"))
            {
                System.out.println("Tekrar giriş yapmayı deneyiniz.");
            }
        }
    }
}
