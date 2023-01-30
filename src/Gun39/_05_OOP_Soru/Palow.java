package Gun39._05_OOP_Soru;

public class Palow implements IFood{
    @Override
    public void taste() {
        System.out.println(" ekşili");

    }

    @Override
    public double ucret() {

        return 40;
    }

    public void fry(){
        System.out.println("kızartıldı");
    }

    public void boil(){
        System.out.println("kaynatıldı");
    }
}
