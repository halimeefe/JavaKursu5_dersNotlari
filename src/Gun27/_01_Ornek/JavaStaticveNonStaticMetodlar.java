package Gun27._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

  int sayi=345;
  String strSayi=String.valueOf(sayi);// sayıyı stringe çevirdik
   int intsayi= Integer.parseInt(strSayi);//stringi sayıya  çevirdik



   Utility ut=new Utility(); // METODA STATİC YAZMAZSAK NESNEDEN YENİ BİR TANE OLUŞTURMAMIZ GEREKİYOR
   String strSayi2=ut.getString(sayi);

         //static metodlar zaten var oldukları için*******************
        //new ile yeniden oluşturulmaya ihtiyaç duymazlar************

        String strSayi3=Utility.getString2(sayi);// METODA STATİC YAZARSAK YENİ NESNE OLUŞTURMADAN ÇAĞIRABİLİRİZ
                                                 //STATİC DURAĞAN ,SABİT DEMEK BU ZATEN VAR DEMEK,YENİDEN NESNE OLUŞTURMAYA
                                                //GEREK KALMADI,STATİC OLAN METODLAR CLASA AİT YANİ TİPE
                                                //STATİC OLMAYAN METODLAR NESNEYE AİT BU SEBEPLE MUTLAKA YENİDEN
                                                 //MAİNDE NESNE OLUŞTURULUR ***ÖRN:UTİLİTY UT NEW UTİLİTY GİBİ***
        //NESNEYE İHTİYACI OLMAYAN METODLARI
        //STATİC YAZIYORUZ
        //ÖRNEK: GET.VALUE,MATH.RANDOM,PARSEINT GİBİ***




    }
}
