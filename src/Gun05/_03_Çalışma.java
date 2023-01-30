package Gun05;

public class _03_Çalışma {
    public static void main(String[] args) {
         // NARROWİNG CASTİNG

        double oran= 3.2;
        int sayi= 5;

        sayi = (int) oran;// büyük bir alanı küçük bir alana atıyosun

        // tehlikeli işlem yapıyorsun bundan dolayı challenger patlayabilir.
        //değerlere bak eğer oluşan veri kaybını anladıysan ve kabulünse bana
        //bunu bilerek yaptığını göster yani belirt,parantez içinde int yazdığımız kısım.

        System.out.println("sayi="+sayi);

        /********************************************************************************/


        byte kisaKenar =5;
        byte uzunKenar =7;

        // byte ın alacağı değer en fazla 127 ve -128 ama işlem olunca int olarak algılıyor,
        // burdada inte atacağımız için byte olarak parantez içinde
        //belirtmemiz gerekiyor.

        byte cevre = (byte) (kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        System.out.println("cevre=" + cevre);


        /**************************************************************************************/

        // 3 farklı ( String,char,int,boolean) tip de değişken tanımlayınız.
        // Değer atayınız ve ekrana yazdırınız.

        // İsmet Temur 5 A geçtiMi;
        // tamAd , sinif, sube , gectiMi

        String tamAd= "ismet temur";
        int sinif = 5;
        char sube = 'a';
        boolean gectiMi = true;
        System.out.println("gectiMi="+gectiMi);
        System.out.println(tamAd+" "+sinif+" "+sube+" ,durumu ="+gectiMi);

        /**************************************************************************/


        // Kişinin ağırlığını double,boyunu int olarak değerler veriniz
        //ve bir satırda boyunuz ve kilonuz şeklinde yazdırınız
        //vucut kitle indexını de bularak yazdırınız.kg/boy*boy



        double kilo =75.0;
        int boy =165;
        double kitleIndex = kilo/ (boy*boy);
        System.out.println("kitleındex= "+kitleIndex);

        System.out.println("boyunuz:"+boy+" , kilonuz:"+kilo);

        /*********************************************************************/

        // ŞU ANA KADAR SAYILARI BİRBİRİNE ÇEVİRDİK.
        //YAZILARIN RAKAMLARA ÇEVRİLMESİ,RAKAMLARIN YAZIYA ÇEVRİLMESİ VAR,

         // ÖRNEK: String kelimeSayi="65"; //BU HALDEYKEN YANİ STRİNG DURUMUNDA PARANTEZ İÇİNDEYKEN HİÇ BİR MATEMATİK
        //İŞLEMİ YAPILAMAZ.


        String kelimeSayi="65";
        int sayiDeger = Integer.parseInt(kelimeSayi); // parse int dediğimiz zaman sayıya dönüşür.

        int toplam = sayiDeger+sayiDeger;
        System.out.println("toplam:"+toplam);

        // BİRDE SAYIYI YANİ İNT İ STRİNG E DÖNÜŞTĞREBİLİRİZ.

        String strToplam = Integer.toString(toplam);
        System.out.println("strToplam:"+ strToplam);

        /********************************************************************************/
























    }
}
