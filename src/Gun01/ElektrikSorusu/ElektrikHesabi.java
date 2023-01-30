package Gun01.ElektrikSorusu;

public class ElektrikHesabi {
    int tplTuk = 0;
    double brFyt = 0.7;
    double ftr = 0;

    public void tukekle(int aylikTuketim) {
        tplTuk += aylikTuketim;


    }

    public void tplTukYaz() {
        System.out.println("TOPLAMTUKYAZ:" + tplTuk);
    }

    public void ftrYaz(String isim) {

        double toplamUcret = brFyt * tplTuk;
        System.out.println("****************");
        System.out.println("MÜŞTERİ İSİM:" + isim);
        System.out.println("**********************");
        System.out.println("toplam tuketim:" + tplTuk);
        System.out.println("***********************");
        System.out.println("toplam tutar:" + Math.round(toplamUcret));
        System.out.println("***********************************");

    }
}


