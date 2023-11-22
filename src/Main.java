import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName , password ;
        int right = 3 ;
        int balance = 1500;
        int select ;

        while (right > 0){
            System.out.print("Kullanıcı Adınız:");
            userName = inp.nextLine();
            System.out.print("Parolanız:");
            password = inp.nextLine();
            if (userName.equals("mertcan poyraz") && password.equals("mert123")) {
                System.out.println("Giriş Başarılı");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi Seçiniz:");
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Görüntüleme\n4-Çıkış Yap");
                    select = inp.nextInt();
                    if (select == 1) {
                        System.out.println("Para Miktarı:");
                        int price = inp.nextInt();
                        balance += price;
                        System.out.println("Yeni Bakiyeniz:" + balance + "TL");
                    } else if (select == 2) {
                        System.out.println("Para Miktarı:");
                        int price = inp.nextInt();
                        balance -= price;
                        if (price > balance){
                            System.out.println("Yetersiz Bakiye!");
                        }else {
                            System.out.println("Bakiyeniz:" + balance + "TL");
                        }

                    } else if (select == 3) {
                        System.out.println("Bakiyeniz:" + balance + "TL");

                    }else {
                        System.out.println("Tekrar görüşmek üzere,iyi günler!");
                    }
                } while (select != 4);
                break;
            }else{
                right--;
                System.out.println("Hatalı giriş yaptınız!");
                if (right == 0){
                    System.out.println("Hesabınız bloke edildi,Banka ile iletişime geçiniz!");
                }else {
                    System.out.println("Kalan Hakkınız:" + right);
                }

                }






            }


        }



    }
