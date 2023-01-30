package Gun34._04_Protected.Paket1;

public class P1Hayvan {

    public String ad;  //HER PAKETTEN HER YERDEN ERİŞİLİR
    int yas;   //SADECE  BULUNDUĞU PAKETTEN ERİŞİLİR
    protected String cinsi;  // DEFAULT GİBİDİR BULUNDUĞU PAKETTEN ERİŞİLİR AMA ,DİĞER
    //PAKETLERDEN ERİŞİMLE İLGİLİ BİR SEÇENEĞİ VAR
    private String renk;// SADECE BULUNDUĞU CLASTAN ERİŞİLEBİLİR

}
