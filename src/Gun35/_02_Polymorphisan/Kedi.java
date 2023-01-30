package Gun35._02_Polymorphisan;

public class Kedi extends Hayvan {

    public Kedi(String name) {
        super(name);
    }// CONSTUCTOR
    public void ses()
    {
        System.out.println("miyavladı");// HAYVAN CLASINDAN EXTEND YAPTIK

    }
    public void tirmaladi()
    {
        System.out.println("tırmaladı");// KEDİYE ÖZEL METOD HAZIRLADIK TIRMALADI DİYE
    }
}
