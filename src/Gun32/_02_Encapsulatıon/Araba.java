package Gun32._02_Encapsulatıon;

public class  Araba {
    private String renk;
    private int model;
    private double motorHacmi;
    private int KapiSayisi;

    public Araba() {  // elle atama yapabilmemiz için bu boş constructoru yazıyoruz
    }

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi); // constructorı bu şekilde set olarak programladık ki
        setKapiSayisi(kapiSayisi);  // aşağıdaki get set kurallarına uyulsun
                                    // yani kontrollü atama yapabiliyoruz
                                    // güvenli program set ve getleri kullanarak yazılır


       // this.renk = renk;
       // this.model = model;
       // this.motorHacmi = motorHacmi;// bu şekilde constructor ile yaparsak
       // KapiSayisi = kapiSayisi;     // her girilen yeni bilgiyi kabul eder
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", KapiSayisi=" + KapiSayisi +
                '}';
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model<2023)
        this.model = model;
        else
            System.out.println("hatalı model");
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return KapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi<7 )
        KapiSayisi = kapiSayisi;
        else
            System.out.println("hatalı kapı sayısı");
    }
}

