import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int right = 3; int sec;
        double balance = 1500;

        while (right>0) {
            System.out.println("Kullanıcı adı girin");
            String userName = scan.nextLine();
            System.out.println("şifre girin");
            String passwd = scan.nextLine();

            if(userName.equals("patika") && passwd.equals("dev123")){
                System.out.println("Hosgeldiniz");

                do {
                    System.out.println("Lutfen islem secin:\n" + "1-Para yatırma\n" + "2-Para cekme\n" + "3-Bakiye sorgulama\n" + "4-cıkış");
                    sec = scan.nextInt();
                    switch (sec) {
                        case 1:
                            System.out.println("Yatırılacak para miktarı: ");
                            double add = scan.nextDouble();
                            balance += add;
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.println("Cekilecek para miktarı: ");
                            double withdraw = scan.nextDouble();
                            if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance -= withdraw;
                                System.out.println("Bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("yine bekleriz");
                            right = 0;
                            break;
                        default:
                            System.out.println("Yanlış secim yaptınız");
                    }
                }
                while (sec != 4);

            }
            else if (right == 1 ){
                System.out.println("kullanıcı adı veya şifre yanlış. Hesabınız kilitlendi");
                right--;
            }

            else {
                System.out.println("kullanıcı adı veya şifre yanlış. Tekrar deneyin\n" + "Kalan hakkınız: " + --right);
            }
        }

    }
}
