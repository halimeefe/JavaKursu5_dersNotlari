package Gun33._02_Inheritance;

public class Kopek extends Hayvan{   //   EXTEND EDEN CLAS THİS OLUYOR
                                    // THİS.AD
                                    // THİS.CİNS GİBİ


    public Kopek(String renk, int kilo, String cinsi) {  //extends üzerinde ki kırmızı çizgiye create constructor
        super(renk, kilo, cinsi);                       //tıklarız ve bütün aynı bilgiler bu satıra otomatik geçer
    }                                                  //super miras aldığı clastır

    @Override
    public void konustu() {
        System.out.println("havladı");
    }
}

