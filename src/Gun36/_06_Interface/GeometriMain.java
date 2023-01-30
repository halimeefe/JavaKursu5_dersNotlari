package Gun36._06_Interface;

public class GeometriMain {
    public static void main(String[] args) {






        Dikdortgen d=new Dikdortgen();
        System.out.println("dikdörtgen çevre:"+d.cevre(5,7));
        System.out.println("dikdörtgen alan:"+d.alan(5,7));


        Kare k=new Kare();
        System.out.println("kare çevre:"+k.cevre(5,5));
        System.out.println("kare alan:"+k.alan(5,5));

    }
}
