package Gun39._05_OOP_Soru;

public class Lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("mükemmel yerli pizza");

    }

    @Override
    public double ucret() {

        return 20;
    }

    public void dough(){
        System.out.println("hamur açıldı");
    }
    public void addMeat(){
        System.out.println("et eklendi");
    }
    public void bake(){
        System.out.println("pişirildi");
    }
}
