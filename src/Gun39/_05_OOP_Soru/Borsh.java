package Gun39._05_OOP_Soru;

public class Borsh implements IFood{
    @Override
    public void taste() {
        System.out.println("ekşili");

    }

    @Override
    public double ucret() {


        return 50;
    }
    public void boil(){
        System.out.println("kaynatıldı");

    }
    public void addMeatAndVegetable(){
        System.out.println("etler ve sebzeler eklendi");
    }
}
