package Gun38._01_Ornek;

public  abstract class BinekOto {

    // abstract 2 si bir arada yöntemidir
    // yani bir interface ve bir parent class kullanacaksak
    //ikisini abstract yaparak bir clasta birleştirebiliriz
    // 1 er taneyse

    private  String marka;
    private  int uretimYili;
    private  int vitesAd;

    public BinekOto(String marka, int uretimYılı, int vitesAd) {
       setMarka(marka);
       setUretimYılı(uretimYılı);
        setVitesAd(vitesAd);
    }
    abstract int HizlanmaSuresi();   // INTERFACE YAZACAĞIMIZ İMPLEMENT YAPACAĞIMIZ METODU BURAYA PARENT
                                      //CLASA YAZDIK İKİSİNİ BİRLEŞTİRDİK VE EXTEND OLARAK FOR CLASTAN ÇAĞIRDIK


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYılı() {
        return uretimYili;
    }

    public void setUretimYılı(int uretimYılı) {
        this.uretimYili = uretimYılı;
    }

    public int getVitesAd() {
        return vitesAd;
    }

    public void setVitesAd(int vitesAd) {
        this.vitesAd = vitesAd;
    }
}
