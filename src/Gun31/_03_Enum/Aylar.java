package Gun31._03_Enum;

public enum Aylar {

    OCAK(1,31,"OCAK"),// SWİTCH CASE KULLANMADAN DA YANINA PARANTEZ AÇARAK ARALARINA VİRGÜL KOYARAK SIRALAMA YAPABİLİRİZ
    SUBAT(2,28,"SUBAT"),// ENUMUN GİZLİ PARANTEZLERİNE TANIMLAMA YAPABİLİRİZ
    MART(3,31,"MART"),  //SONRADA CONSTRUCTORDA İSİMLERİNİ YAZDIRIRIZ
    NISAN(4,30,"NISAN"),
    MAYIS(5,31,"MAYIS"),
    HAZIRAN(6,31,"HAZİRAN"),
    TEMMUZ(7,31,"TEMMUZ"),
    AGUSTOS(8,31,"AĞUSTOS"),
    EYLUL(9,30,"EYLÜL"),
    EKIM(10,31,"EKİM"),
    KASIM(11,30,"KASIM"),
    ARALIK(12,31,"ARALIK"),
    ;


    final   int ayNo;//bu değerler değiştirilemez değerler olduğu için tipini final yaparız
   final int gunMiktar;
  final   String ayAd;


    Aylar(int ayNo, int gunMiktar, String ayAd) {// CONSTRUCTOR DA YAZDIRIRIZ
        this.ayNo=ayNo;
        this.ayAd=ayAd;
        this.gunMiktar=gunMiktar;
    }
}

