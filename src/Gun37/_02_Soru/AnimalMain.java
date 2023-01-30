package Gun37._02_Soru;

import Gun37._01_Soru.TeslaCar;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {




        ArrayList<Animals> animals = new ArrayList<>();

        Shark sh = new Shark("Testere dişli","Mavi");
        Cat ct = new Cat("Scotish","Beyaz");
        Duck dk = new Duck("SARI","PEKİN");
        Swallow sw = new Swallow("Kaya kırlangıcı","Kızıl");
        animals.add(sh);
        animals.add(ct);
        animals.add(dk);
        animals.add(sw);

        for (Animals a : animals) {
            System.out.println("****************************");
            System.out.println(a.getClass().getSimpleName());
            System.out.println("*****************************");
            System.out.println("CİNSİ:"+a.getCinsi());
            System.out.println("RENK:"+a.getRenk());

            if (a instanceof Shark) {
                System.out.println(((Shark) a).food());
                System.out.println(((Shark) a).yuzer());
            } else
                if (a instanceof Cat) {
                System.out.println(((Cat) a).food());
            } else
                if (a instanceof Duck) {
                System.out.println(((Duck) a).food());
                System.out.println(((Duck) a).yuzer());
                System.out.println(((Duck) a).ucar());
            } else
                if (a instanceof Swallow) {
                System.out.println(((Swallow) a).food());
                System.out.println(((Swallow) a).ucar());

            }

        }
    }
}

