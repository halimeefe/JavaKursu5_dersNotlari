package Gun31._01_Enum;

public class Ornek_1Cozum {

    enum Aylar{
        Tanimsiz,OCAK,SUBAT,MART,NISAN,MAYIS,HAZIRAN,TEMMUZ,AGUSTOS,// BAŞINA TANIMSIZ YAZARSAK OCAK AYINI BİR OLARAK SAYAR
        EYLUL,EKIM,KASIM,ARALIK  //SIRALARKEN ARALARINA VİRGÜL KOYARIZ
    }

    public static void main(String[] args) {
        Aylar ay=Aylar.MAYIS;

        switch (ay){
            case SUBAT: System.out.println(28);break;// ENUM İLE CASE LERE NUMARA VERMEYE GEREK KALMADI
            case OCAK:                              //BÖYLE SIRALI VE TANIMLI DEĞERLERDE ENUM KULLANIRIZ
            case MART:                              //ENUM TİPİNDE SIRALI YAZARIZ CLASTA
            case MAYIS:                             //İF İN VE SWİTCHİN OLDUĞU HER YERDE KULLANABİLİRİZ ENUMARATÖRÜ
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31);break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30);break;
        }
        if (ay==Aylar.MAYIS){  //  EĞER AYLARDAN MAYISSA ZAM YAPILDI YAZDIRDIK
            System.out.println("zam yapıldı");
        }
        System.out.println("ay ismi :"+ay);// to string
        System.out.println("ay.name:"+ay.name());//simge olarak kullanıldı
        System.out.println("ay ordinal():"+ay.ordinal());//simgenin indx.VERİYOR//MAYIS AYININ İNDEXİ 5 OLARAK YAZILDI
                                                         //ORDİNAL ENUMARATÖRÜN İNDEXİNİ VERİR
        for (Aylar a:Aylar.values())//
            System.out.println(a.name()+"-"+a.ordinal());// FOR EACH İLE AYLARI " a " DA TOPLAYIP SIRALARIZ
                                                         // A.NAME AYLARIN ADINI YAZDI --A.ORDİNAL KAÇINCI AY OLDUĞUNU YAZDI
             // Yazılım dillerinde enum, enumaration ve enum sabitleri
             // olarak adladırılmaktadır. Tanımlanan değişkenlerin
            // sabit değer alması için kullanılır. Tanımlanan
            // bu sabit değerler bir grup oluşturur. Erişilmesi,
            // yönetilmesi ve anlaşılması kolay hale gelir.

            //bir sürü girilmesi gereken datayı  tek seferde
            // parti halinde giriyoruz,daha sonra kullanması
            // da kolay yazması da kolay oluyor


    }

}
