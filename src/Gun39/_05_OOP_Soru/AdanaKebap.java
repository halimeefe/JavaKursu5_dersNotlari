package Gun39._05_OOP_Soru;

public class AdanaKebap implements IFood {

    @Override
    public void taste() {
        System.out.println("acılı");

    }

    @Override
    public double ucret() {

      return 75;
    }





    public void marinade(){
        System.out.println("marine edildi");
    }

    public void grill(){
        System.out.println("ızgarada pişirildi");
    }
}

