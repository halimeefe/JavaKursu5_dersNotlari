package Gun33._01_Inheritance;

public class SirketMain {
    public static void main(String[] args) {


        YoneticiYeni yonetici=new YoneticiYeni();
        yonetici.setTcNo("123456");
        yonetici.setAd("ismet");
        yonetici.setSoyAd("temur");
        yonetici.setMaas(1500000);
        yonetici.setDepartman("mudur");
        yonetici.setSicilNo("13");
        yonetici.setTelNo("123 23 23");
        yonetici.setYas(44);

        //DİĞER CLASIN HER ÖZELLİĞİNİ VE METODLARINI
        //ALIP KULLANMAYA INHERITANCE YANİ KALITIM
        //YANİ MİRAS ALMA DENİR
        // BİLGİLERİ ALMA YÖNTEMİMİZ EXTENDS DİR PERSONEL CLASINDA GİRİLEN
        //BİLGİLERİN AYNISINI YÖNETCİ CLASINA EXTENS YAZARAK ÇAĞIRABİLİR
        //SONRADA MAİNDE BU BİLGİLERİ KULLANABİLİRİZ

        //INHERİTANCE KALITIM MİRAS ALMA DENİR
        //EXTENDS YAPILAN CLASLARIN HEPSİ AYNI DEĞİŞKENLERİ KULLANABİLİR



    }
}
