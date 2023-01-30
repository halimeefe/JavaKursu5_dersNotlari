package Gun30._02_FinalVariables.Ornek_1;

public class Vatandas {

    String isim;

    final int tcNo;//değiştirilemez
    //yani sadece 1 kez veri atama şansı var.// NESNEYE AİTTİR VE NESNEYE AİT KALMALI

    static int tcNoSayac=1;  // TCNOSAYAC IN GÖREVİ YENİ TCLER ATIYOR SIADAKİ KİŞİYE

    public Vatandas(String isim){
        this.isim=isim;
        this.tcNo=tcNoSayac++;
        //final değşkenlerine sadece 1 kez veri atanabilir
        // o da ya tanımlanırken, yada constructor da
        // final değiştirilemeyen sabit değerler için kullanılır
        //tc no ,id vb.

        // finalin görevi tc değiştirilemesin
        // her vatandaşa yeni tc ekleme ise tcnosayacın görevi

    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}



