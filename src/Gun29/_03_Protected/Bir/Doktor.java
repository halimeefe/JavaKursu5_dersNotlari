package Gun29._03_Protected.Bir;

public class Doktor {
    protected String adi;// default ile aynı //SADECE KENDİ PAKETİ ERİŞEBİLİR

    String bolumu;// default//

    private String SicilNo;//private gizli// KENDİ CLASI BİLE ULAŞAMAZ

    public  String hastaneAd;// public //HER PAKETTEN ULAŞILIR

    Doktor(){//DEFAULT CONSTRUCTOR

    }

    public Doktor(String adi)
    {
        this.adi=adi;
    }//PUBLİC CONSTRUCTOR
}
