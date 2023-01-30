package Veritabani;

import Modeller.Calısanlar.Calisan;
import Utility.MyFunction;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);


        while (true) {
            System.out.println("-------------------------------");
            System.out.println("Şirket Paneline Hoşgeldiniz.Lütfen bir işlem seçiniz.");
            System.out.println("--------------------------------");
            System.out.println("1-Çalışan İşlemleri\n2-Tüm Çalişamları Görüntüle\n3-Departmandaki Tüm Çalışanları Görüntüle\n4-Çıkış");
            System.out.println("---------------------------------");
            System.out.print("Islem : ");
            int secim = input.nextInt();
            System.out.println("İşleminiz gerçekleştiriliyor Lütfen Bekleyiniz...");
           MyFunction.Bekle(1);

            if (secim == 1) {
                while (true) {
                    System.out.println("------------------------------");
                    System.out.println("Çalışan işlemleri paneline hoşgeldiniz.Lütfen bir işlem seçiniz");
                    System.out.println("1-Çalışan Ekle\n2-Çalışan Sil\n3-Zam Yap\n4-Onceki Menü\n");
                    System.out.print("İşlem : ");
                    int secim2 = input.nextInt();
                    System.out.println("İşleminiz gerçekleştriliyor lütfen bekleyiniz...\n");
                    MyFunction.Bekle(1);

                    if (secim2 == 1) {
                        System.out.print("Lütfen isim ve soyisim giriniz : ");
                        String calisanAdSoyad = stringInput.nextLine();
                        System.out.println("Lütfen maaş giriniz : ");
                        int calisanMaas = input.nextInt();

                        System.out.println("Lütfen departman kodunu ekleyiniz: ");
                        String calisanDepartmanKod = stringInput.nextLine();


                        new Calisan(calisanAdSoyad, calisanMaas, calisanDepartmanKod);
                        System.out.println("Çalışan başarıyla eklendi.Önceki menüye aktarılıyorsunuz ...");
                        MyFunction.Bekle(1);
                        break;


                    } else if (secim2 == 2) {

                        System.out.print("Lütfen silmek istediğiniz çalışanın ID sini giriniz : ");
                        String calisanId = stringInput.nextLine();
                        Calisanlar.deleteCalisanWithId(calisanId);
                        System.out.println(calisanId + " başarıyla silindi,Önceki menüye aktarılıyorsunuz");
                        MyFunction.Bekle(1);
                        break;


                    } else if (secim2 == 3) {


                        System.out.println("Lütfen zam yapmak istediğiniz çalışanın ID sini giriniz : ");
                        String calisanId = stringInput.nextLine();

                        System.out.println("işlem başarıyla gerçekleşti ,Önceki menüye aktarılıyorsunuz ");
                        MyFunction.Bekle(1);
                        break;

                    } else if (secim2 == 4) {
                        System.out.println("işleminiz gerçekleştiriliyor lütfen bekleyiniz...\n ");
                        MyFunction.Bekle(1);
                        break;

                    } else {
                        System.out.println("Hatalı seçim yaptınız lütfen tekrar deneyiniz");

                    }

                }
            } else if (secim == 2) {
                System.out.println("Tüm Çalışanlar listeleniyor...");
                MyFunction.Bekle(1);
                System.out.println("--------------------------------");
                Calisanlar.printCalisanlar();
                System.out.println("----------------------------------");



            } else if (secim == 3) {
                System.out.println("Lütfen departman kodunu giriniz : ");
                String departmanKodu = stringInput.nextLine();
                System.out.println("Tüm çalışanlar listeleniyor...");
                MyFunction.Bekle(1);
                System.out.println("---------------------------------");
                Calisanlar.printDepartmandakiCalisanlar(departmanKodu);
                System.out.println("----------------------------------");

            } else {
                System.out.println("Başarıyla çıkış yaptınız,iyi günler dileriz.");
                break;
            }
        }
    }
}






















