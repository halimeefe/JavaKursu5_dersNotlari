package Gun28._04_Constructor;

public class Banka {

    String ad;
    int subeSayisi;
    int kurulusYili;

    public Banka() {

    }

    public Banka(String ad, int subeSayisi, int kurulusYili) {
        this.ad = ad;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String ad, int subeSayisi) {
        this.ad = ad;
        this.subeSayisi = subeSayisi;


    }



    @Override
    public String toString() {
        return "Banka{" +
                "ad='" + ad + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}





