package Gun38._02_Ornek;

public class GeometriMain {
    public static void main(String[] args) {


        Dikdörtgen d=new Dikdörtgen(4,5);
        d.setName("DİKDÖRTGEN");
        d.ciz();
        System.out.println(d);

        Daire dr=new Daire(4);
        dr.setName("DAİRE");
        dr.ciz();
        System.out.println(dr);


    }
}
