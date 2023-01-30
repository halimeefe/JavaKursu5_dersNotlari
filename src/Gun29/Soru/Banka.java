package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {

        // Hesap (yatan(int), cekilen(int), bakiye(int))
        // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.

        Musteri m1=new Musteri();
        m1.musteriNo=1;
        m1.name="ismet";
        m1.surname="temur";

        m1.musteriHesap.paraYatir(100);
        m1.musteriHesap.paraYatir(200);
        m1.musteriHesap.paraCek(50);

        System.out.println(m1.musteriHesap);




    }
}
