package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {


        P1Hayvan P1h=new P1Hayvan();
        P1h.ad="KÖPEK";// BAŞKA PAKETTEN SADECE ADA ULAŞABİLDİK PUBLİK OLDUĞU İÇİN
        //YAŞ DEFAULTTUR DİĞER PAKETTEN ERİŞİLEMEZ
        //CİNSEDE ERİŞEMEDİK DİĞER PAKETTEN PROTECTED OLDUĞU İÇİN
        // PRİVATE ZATEN SADECE KENDİ CLASINDAN ERİŞİLİR

        //protected olunca direk clastan alamıyoruz ama extend yapınca
        //  yani inheritance kullandığımızda yeni bir clastan türetebiliriz


    }
}
