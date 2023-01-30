package Gun34._02_Ornek;

public class LiseOgr extends Ogrenci {
    private String brans;

    public LiseOgr(String isim, OgrTip tipi, String brans) {
        super(isim, tipi);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "LiseOgr{" +
                "brans='" + brans + '\'' +
                "} " + super.toString();
    }
}
