package Gun01._Proje_02_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Actions {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        ArrayList<client> cl=new ArrayList<>();
        ArrayList<Integer> funds = new ArrayList<>();
        ArrayList<String> passWord = new ArrayList<>();
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> accounts = new ArrayList<>();
        ArrayList<String> action = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));

        client c1=new client();
        client c2=new client();
        client c3=new client();
        c1.hNo="12";
        c1.uName="cihat";
        c1.pass="1234";
        c1.mikt=1000;
        c2.hNo="13";
        c2.uName="neval";
        c2.pass="1002";
        c2.mikt=2000;
        c3.hNo="14";
        c3.uName="onur";
        c3.pass="123456";
        c3.mikt=3000;
        cl.add(c1);
        cl.add(c2);
        cl.add(c3);

        withdraw( cl,funds,passWord,users,accounts);

        while (true){

            System.out.println("Lütfen kullanıcı adını giriniz...");
            String s=scan.next();
            System.out.println("Lütfen şifrenizi giriniz...");
            String p=scan.next();
            if (confirmusernameAndpassword(users,passWord,s,p)){
                System.out.println("Tebrikler,başarılı bir şekilde giriş yaptınız:)");
                break;
            }else
                System.out.println("Sisteme kayıtlı böyle bir kullanıcı bulunmadı..Tekrar deneyin!!!");

        }
        while (true){
            System.out.println("Yapmak istediğiniz işlemi seçiniz...");

            for (int i = 0; i < action.size(); i++) {
                System.out.println(action.get(i)+"-"+(i+1));

            }
            int choice=scan2.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Bu bankamatik geçici olarak para yatırma işlemine kapalıdır...Üzgününüz");
                    break;
                case 2:
                    System.out.println("Hangi hesaptan para çekmek istiyorsunuz?");
                    System.out.println(accounts);
                    System.out.println("Hesap numaranızı giriniz...");
                    String str=scan2.next();

                    int mik=accounts.indexOf(str);//  hesap nonun indexi******müşterinin hesaptaki parası ile hesap no eşitlenecek

                    while (true) {
                        System.out.println("Lütfen para miktarını giriniz...");
                        int money=scan3.nextInt();
                        if (funds.get(mik)>=money){
                            System.out.println("Lütfen paranızı alınız hesabınızda "+(funds.get(mik)-money)+" dolar kalmıştır.");
                            break;

                        } else if (funds.get(mik)<money) {
                            System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır...");

                        }

                    }break;
                case 3:
                    System.out.println("Bu işlemi şu an gerçekleştiremiyoruz...");
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Başarılı bir seçim yapmadınız");
            }
        }
    }
    public static boolean confirmusernameAndpassword(ArrayList<String>users,ArrayList<String>p,String username,String passWord){
        if (users.contains(username)&& p.contains(passWord)){
            return true;
        }else
            return false;
    }

    public static void withdraw(ArrayList<client>cl,ArrayList<Integer>funds,ArrayList<String>passWord,ArrayList<String>users,ArrayList<String>accounts){
        for (int i = 0; i < cl.size(); i++) {
            funds.add(cl.get(i).mikt);
          passWord.add(cl.get(i).pass);
          users.add(cl.get(i).uName);
          accounts.add(cl.get(i).hNo);

            }


        }
    }

