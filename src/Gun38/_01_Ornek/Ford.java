package Gun38._01_Ornek;

public class Ford extends BinekOto{

    public Ford(String marka, int uretimYili, int vitesAd) {
        super(marka, uretimYili, vitesAd);
    }

    @Override
    int HizlanmaSuresi() {
        return 0;
    }
}
