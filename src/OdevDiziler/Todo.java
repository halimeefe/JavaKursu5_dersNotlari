package OdevDiziler;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {


        //bir döngü ile 5 tane rastgele sayı bulun
        // fakat bir bulduğunu tekrar bulmasın


        // uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz
        // bir kod yazınız.


        //mentör  // Ödev Soru 1: 0-100 arasındaki tek ve çift sayıların toplamını ayrı ayrı bulunuz.


        // Bir sayı bulmaca oyunu yapılmak isteniyor
        //bilgisayar 10-20 arasında bir sayı tutsun,kullanıcı
        //bu sayıyı bulmaya çalışsın,
        // kullanıcının 3 hakkı olsun.3hakkın sonunda da bilemezse,
        // bilemediniz yazsın tutulan sayıyı bildirsin.
        //Eğer bilirse tebrikler yazsın.


        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz


        //ÖZEL SORU : BİZİM 3 TANE SAATİMİZ VARDIR.
        // BİR TANESİ TAM DOĞRU ÇALIŞIYOR
        //BİR TANESİ HER SAATTE 20DK.GERİ KALIYOR
        // BİR TANESİ HER SAATTE 15 DK. İLERİGİDİYOR
        // BU 3 SAATTE SAAT 16 DA ÇALIŞMAYA BAŞLIYOR.
        //BU SAATLER KAÇ SAAT SONRA VE DAKİKA SONRA TEKRAR
        //AYNI SAATİ GÖSTERİRLER AYNI ANDA.

        //Soru 2: Kullanıcıdan bir ülke adı alarak aşağıdaki gibi yazdırınız.

// e
// ye
// iye
// kiye
// rkiye
// ürkiye
// Türkiye
        //Kullanıcıdan PIN kodunu alan ve kod doğru ise sisteme giriş yaptıran programı yazınız.
//// Eğer PIN kodu üç kez yanlış girilirse kartı bloke ediniz.


        //Kullanıcıdan PIN kodunu alan ve kod doğru ise sisteme giriş yaptıran programı yazınız.
//// Eğer PIN kodu üç kez yanlış girilirse kartı bloke ediniz.

        // kullanıcının gireceği bir rakama kadar
        // olan sayıların toplamını bulunuz

        // Ornek 5 : Verilen bir Array de tekrar eden elemanlari yazdirin...
        int[] numbers2 = new int[]{2, 4, 6, 8, 4, 6, 10, 10};


        // Ornek 4 : Verilen bir dizide her elemanin kac defa tekrar ettigini bulan programi yaziniz..

        Scanner oku = new Scanner(System.in);
        int[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        Arrays.sort(numbers);
        System.out.print(Arrays.toString(numbers));
        System.out.println();
        int sayac = 0;
        System.out.print("Aranan rakam:");
        int arananSayi = oku.nextInt();


        while (true) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == arananSayi) {
                    sayac = sayac + 1;
                }
            }
            System.out.println(arananSayi + " " + "sayısı, dizide" + " " + sayac + " " + "tane  var");

        }



        }
    }













































































// Ödev Soru 1: 0-100 arasındaki tek ve çift sayıların toplamını ayrı ayrı bulunuz.














































































