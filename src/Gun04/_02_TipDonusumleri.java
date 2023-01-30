package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {

        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;

        int toplam=ogrNot1;   // byte -> int atınca problem çıkarmadı ( GENİŞLETME -WİDENİNG CASTİNG)
        //çünkü byte için hafızada ayrılan, zaten int e sığar,sığdığı için kabul ederim.
        //çünkü veri kaybı olma ihtimali hiç yok.

        ogrNot1=(byte)toplam;  // int -> byte atınca dur bakalım dedi (DARALTMA NARROW CASTİNG)
        // büyük hafıza ayrılmış bir alanı ,küçük hafızaya  ayrılmış alana atma işlemi var.
        // veri kaybı ihtimali var mı.




    }
}
