package Gun35._02_Polymorphisan;

public class Hayvan {


    private  String name;


    public Hayvan(String name) {
        this.name = name;
    }  //CONSTUCTOR

    public void ses()
    {
        System.out.println("ses çıkardı");
    } // SES ÇIKARDI METODU

    public String getName() {
        return name;
    } //GETLER

    public void setName(String name) {
        this.name = name;
    } //SETLER


    public static void hayvanSesi(Hayvan hayvan)
    {
        hayvan.ses();
    } //

    @Override
    public String toString() {
        return "Hayvan{" +
                "name='" + name + '\'' +
                '}';
    }
}
