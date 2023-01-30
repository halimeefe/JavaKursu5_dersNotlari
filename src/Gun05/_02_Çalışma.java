package Gun05;

public class _02_Çalışma {
    public static void main(String[] args) {


        // sSORU= YARIÇAPI (r) VERİLEN BİR DAİRENİN CEVRESİNİ VE ALANINI BULUNUZ.
        // ALAN=Pİ*R*R
        //CEVRE=2*Pİ*R

        double yaricapi = 4.5;

        double cevre = 2 * 3.14 * yaricapi;
        double alan = 3.14 * yaricapi * yaricapi;


        System.out.println("cevre =" + cevre);
        System.out.println("alan =" + alan);

        // String : kelime veya kelimeleri saklamak için kullanılır
        // sınırlarını "" ile belirleriz.

        String ad = "Halime";
        System.out.println("ad:" + ad);
        String soyad = "Akçay";
        System.out.println("soyad:" + soyad);
        System.out.println("ad ve soyad:" + ad+"\t"+soyad);

        System.out.println("Halime"+" "+ "Efe");
        System.out.println("HALİME"+" "+"EFE"+" \t " +"YUNUS"+ " "+"EMRE"+" "+"EFE");



        //dur

        // BOOLEAN DEĞİŞKENİ :
        // SADECE İKİ DEĞERİ TRUE VEYA FALSE OLABİLEN DEĞİŞKENLER İÇİN KULLANILIYOR.
        // SADECE KÜÇÜK HARFLE YAZILIYOR

        boolean devamMi = false;
        System.out.println("devamMi="+devamMi);


        // TİP DÖNÜŞÜMLERİ :
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;

        int toplam = ogrNot1; // ogrnot1 byte dır bunu inte atınca sorun çıkmaz (GENİŞLETME ) VAR.WİDENİNG CASTİNG

        ogrNot1=(byte) toplam; // ama toplam kısım inti byte a atınca sıkıntı çıkar çünkü büyük hafıza ayrılmış bir alanı küçük
        // hafıza için ayrılmış bir alana atma işlemi var ve veri kaybı ihtimali var (DARALTMA ) VAR. NARROWİNG CASTİNG
        // DARALTMA DURUMUNDA TOPLAMIN BAŞINDAKİ GİBİ PARANTEZ KISMINDA BELİRTMELİYİZ.


        //WİDENİNG CASTİNG:

        int sayi=9;
        long buyuk=6700;
        double oran =3.2;

        oran= sayi; // oran =9 , kayıp yok
        System.out.println("oran="+oran);

        buyuk=sayi; // kayıp yok , toplam 9
        System.out.println("buyuk="+buyuk);

        oran= buyuk; // kayıp yok,oran =9
        System.out.println("oran = " + oran);

        /************************************************************/


        //  NARROWİNG CASTİNG



















    }


}
