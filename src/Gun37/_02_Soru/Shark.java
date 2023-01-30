package Gun37._02_Soru;

public class Shark extends Animals  implements ISailing{


    public Shark(String cinsi, String renk) {
        super(cinsi, renk);
    }


    @Override
    public String food() {
        return"Diğer deniz canlıları ile beslenir";
    }

    @Override
    public String yuzer() {
        return"Oksijen almak için sürekli yüzmek zorundadır";
    }
}
