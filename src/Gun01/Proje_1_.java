package Gun01;

import java.util.Scanner;

public class Proje_1_ {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.print("Lütfen Adınızı Giriniz: ");
        String a=scan.nextLine();
        a=a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase();
        System.out.print(a+" Hoşgeldin Soyisminizi Girermisiniz: ");
        String si=scan.nextLine();
        si=si.substring(0,1).toUpperCase()+si.substring(1).toLowerCase();
        System.out.println("Adınız ve Soyadınız: "+a+" "+si);
        System.out.print("Adınız ve Soyadınız Doğru ise Y tuşuna basınız: ");
        String y=scan2.next();

        while(true) {
            if (a.equalsIgnoreCase("y")) {
                break;
            } else {
                System.out.print("Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin: ");
                a = scan.next();
            }
        }
        System.out.println("Adınız ve Soyadınız Başarılı Bir Şekilde Sisteme kaydedilmiştir");
        System.out.print("Lütfen Kullanıcı Adınızı Belirleyiniz: ");
        String user=scan2.next();
        System.out.print("Lütfen Şifrenizi Belirleyiniz: ");
        String pass=scan2.next();
        System.out.print("Şifrenizi Tekrar Giriniz: ");
        String pass1=scan2.next();

        if(pass.equals(pass1)){
            System.out.println("Tebrikler "+user+" kullanici adiyla sisteme kayit oldunuz.");
        }else
            System.out.println("Yanlış veya Hatalı Bir Şifre Girdiniz Lütfen Tekrar Deneyiniz!!!");


















    }
}
