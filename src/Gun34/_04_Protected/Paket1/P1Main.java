package Gun34._04_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {


        P1Hayvan P1h=new P1Hayvan();
        P1h.ad="KARAKA KEDİ";// PUBLİC OLDUĞU İÇİN ERİŞİM SAĞLANDI
        P1h.yas=2;// DEFAULT OLDUĞU İÇİN BULUNDUĞU PAKETTEN ERİŞİM SAĞLANDI
        P1h.cinsi="TEKİR";// PROTECTED ERİŞLDİ ,DEFAULT GİBİDİR BULUNDUĞU PAKETTEN ERİŞİM SAĞLANIR
        //P1h.RENK  :PAKETTEN DE ERİŞEMEDİK PRİVATE OLDUĞU İÇİN SADECE KENDİ CLASINDAN ERİŞİLİR
    }
}
