package Gun36._01_Interface;

public interface IMagaza {     // INTERFACE ARAYÜZ DEMEK YANİ BAŞKA CLASLAR İMPLEMENTS YAPABİLİR
                              // ALT CLASLARDA İMPLEMET YAPAN CLASLARDAN EXTEND YAPABİLİR
                             // INTERFACE: BİR SINIFTA OLMASI GEREKEN METODLARI TANIMLAYAN YAPIDIR
                            // İÇİ BOŞ METODLARA METODUN İMZASI DENİR
                           // INTERFACELER DE SADECE METOD OLUYOR FİELD YADA PROPERTİS OLMUYOR
                          //PLANLI KODLAMA YAPMAMIZI SAĞLIYOR
                         // INTERFACE E METOD LİSTESİ DİYEBİLİRİZ
                        // METODUN İMZASINI ATIYORUZ
                       //BİRDEN FAZLA ŞABLON OLUŞTURMAYA İMKAN VERİR ÖRNEK ,ELEKTRİKLİ ARABA BENZİNLİ ARABA GİBİ
                      // DEAFAULT YADA PUBLİC OLABİLİYOR İNTERFACE METODLARI

    void bigileriAl();// İÇİ BOŞ METODLAR METODUN İMZASIDIR
    void krediSkorunuKontrolEt();  //İNTERFACELERDE SADECE METOD YAZIYORUZ FİELD OLMAZ
    void krediSecenekleriniGoster(); // PLANLI KODLAMA YAPMAMIZI SAĞLIYOR
    void belgeleriImzalat();
    void krediyiKullandir();
    void krediSkoruGoster();

}
