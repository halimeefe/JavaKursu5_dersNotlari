package Gun25._05_Soru;

import java.util.*;

public class BordroProgrami {
    public static void main(String[] args) {

        // Bir bordro programı yapılmak isteniyor.----------------
        // Her calisanin bordroNo(int), tamAdi(String) ve maasi(int) vardır.-------------
        // Kullanıcıdan 20 calisan için bu bilgileri alınız.-------------------
        // Bir metodda bütün calisanlar yazdırınız.
        // Bir metodda maas ortalamasını yazdırınız.
        // Bir metodda en fazla ve en az maas alanların isimlerini yazdırınız.
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        ArrayList<Calisan> list = new ArrayList<>();


        // BİNLERCE ÇALIŞAN OLDUĞU İÇİN BUNLARIN İSMİNİ ARRAYLİSTTE SAKLARIZ

        for (int i = 0; i < 3; i++) { // FOR DÖNGÜSÜYLE DİNAMİK BİR ŞEKİLDE ÇALIŞAN  SAYILARI ARTIRABİLİRİZ


            Calisan cls = new Calisan();    // YENİ BİR ÇALIŞAN OLUŞTURUYORUZ
            System.out.print("ÇALIŞANIN  TAM ADI:");
            cls.TamAdi = okuStr.nextLine();
            System.out.print(" ÇALIŞANIN MAAŞI:");
            cls.maas = okuInt.nextInt();
            System.out.print("ÇALIŞANIN BORDRO NOSU:");
            cls.bordroNo = okuInt.nextInt();

            list.add(cls);

        }

        bilgileriYazdir(list);
        maasOrtalamasi(list);
        enFazlaMaasAlan( list);
        enAzMaasAlan(list);


    }
    public static void bilgileriYazdir(ArrayList < Calisan > list){
        for(Calisan cls:list){

            System.out.println("ÇALIŞANIN TAM ADI:"+cls.TamAdi);
            System.out.println("ÇALIŞANIN MAAŞI:"+cls.maas);
            System.out.println("ÇALIŞANIN BORDRO NO:"+cls.bordroNo);


        }



        }public static void maasOrtalamasi(ArrayList < Calisan > list){

        int toplam=0;
        for(Calisan cls:list){

            toplam=toplam+ cls.maas;
        }
        System.out.println("Maaş ortalaması:"+(toplam/list.size()));

    }

    public static void enFazlaMaasAlan(ArrayList < Calisan >list){
        int enb=0;
        int maas=0;
        for (int i = 0; i < 3; i++) {
            if (maas>enb){
                enb=maas;
            }
        }
        System.out.println("en büyük maaş:"+enb);


    }
    public static void enAzMaasAlan(ArrayList < Calisan >list){
        int enz=0;
        int maas=0;
        for (int i = 0; i > 3; i--) {
            if (maas<enz){
                enz=maas;

            }
        }
        System.out.println("en az maaş:"+enz);




    }
}
