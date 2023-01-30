package Gun38._02_Ornek;

public abstract class Sekil {


    private String name;

     abstract double  cevre();// soyut abstract içi boş


     abstract double alan();// soyut absract içi boş



    public void ciz(){  // somut  içi dolu çünkü  sout ile yazdırdık

        System.out.println(name+"çizildi");




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sekil:" +
                "\nname='" + name + '\'' +
                "\nalan='" + alan() + '\'' +
                "\ncevre='" + cevre() + '\'' +
                "\n";
    }
}






