package Gun39._05_OOP_Soru;

import Utility.MyFunction;

public class TechnoKitchen {


    public static void hazirla(IFood f){

        if (f instanceof AdanaKebap){
            ((AdanaKebap)f).marinade();
            ((AdanaKebap)f).grill();
            MyFunction.Bekle(2);
        } else if (f instanceof Lahmacun) {
            ((Lahmacun )f).dough();
            ((Lahmacun)f).addMeat();
            ((Lahmacun)f).bake();
            MyFunction.Bekle(2);

        } else if (f instanceof Borsh) {
            ((Borsh)f).boil();
            ((Borsh)f).addMeatAndVegetable();
            MyFunction.Bekle(2);

        } else if (f instanceof Palow) {
            ((Palow)f).fry();
            ((Palow)f).boil();
            MyFunction.Bekle(2);

        }
        f.taste();
        System.out.println();
    }
}
