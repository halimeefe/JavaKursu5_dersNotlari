package Gun34._02_Ornek;

public class Ogrenci {
    private String isim;
    private final int id;// İD NO YU FİNAL YAPTIK BİR KERE ATANSIN VE DEĞİŞMESİN

    private static int sayacNo=1;// ID NOLARI STATİK SAYACLA 1 DEN BAŞLAYARAK SIRALADIK STATİK OLMASI BİR TANE OLMASI VE HERKESİN KULLANMASI
    //ANLAMINA GELİR VE EN SON ATANAN DEĞER KABUL EDİLİR MESELA FARKLI OKUL İSMİ GİRMEK İSTEDİĞİMİZDE YADA
    // SIRALAMA YAPACAĞIMIZ ZAMAN ID VEYA TC GİBİ STATİC SAYAC KULLANIRIZ
    private OgrTip tipi;// OGRTİP TÜRÜNDE BİR ENUM TİP TANIMLADIK





    public Ogrenci(String isim, OgrTip tipi) {
        setIsim(isim);
        setTipi(tipi);
        this.id=sayacNo++;// SAYACI BURDA 1 DEN BAŞLATTIĞIMIZ İÇİN THİS İD. SAYAC ++ YAZDIK Kİ SAYAC 1 DEN BAŞLASIN VE ARTARAK SIRALANSIN

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }// ID Yİ GET YAPTIK SETE GEREK YOK ÇÜNKÜ BURDA 1 DEN BAŞLATTIK CLASTA TANIMLANDI

    public static int getSayacNo() {
        return sayacNo;
    }

    public static void setSayacNo(int sayacNo) {
        Ogrenci.sayacNo = sayacNo;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", id=" + id +
                ", tipi=" + tipi +
                '}';
    }
}



