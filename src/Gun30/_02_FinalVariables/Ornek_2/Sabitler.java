package Gun30._02_FinalVariables.Ornek_2;

public class Sabitler {

    final static int birGundekiSaatSayisi=24;

    final static int birSaattekiDakSayisi=60;

    final static int birDakikadakiSaniyeSayisi=60;

    // bu değerler değişken değil değiştirilemez o yüzden final yazdık
    // hem de bunlar nesneye ait değil genel değerler olduğu için
    //statik kullandık



  public static int hesapla(int gun,int saat,int dak){
      int toplamSaniye=
              gun
              *Sabitler.birGundekiSaatSayisi
              *Sabitler.birSaattekiDakSayisi
              *Sabitler.birDakikadakiSaniyeSayisi
              +
                      saat
              * Sabitler.birSaattekiDakSayisi
              *Sabitler.birDakikadakiSaniyeSayisi
              +
                      dak
              *Sabitler.birDakikadakiSaniyeSayisi;
      return  toplamSaniye;
  }
}
