package Gun35._02_Polymorphisan;

public class Kopek extends Hayvan{


    public Kopek(String name) {
        super(name);


    }
    public void ses()
    {
        System.out.println("havladı");// HAYVAN CLASINDAN EXTEND YAPTIK

    }
    public void kokladi()
    {
        System.out.println("kokladı");
    }//KÖPEĞE ÖZEL METOD HAZIRLADIK KOKLADI DİYE
                                                             //EXTRA METODLARI BİZ EKLEDİK EXTEND YAPMADIK

}
