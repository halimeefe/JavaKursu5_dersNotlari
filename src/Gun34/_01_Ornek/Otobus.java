package Gun34._01_Ornek;

public class Otobus extends Arac{

    private int yolcuKapasite;

    public Otobus(String renk, int motorHacmi, String marka, int yolcuKapasite) {
        super(renk, motorHacmi, marka);
        setYolcuKapasite(yolcuKapasite);
    }



    public int getYolcuKapasite() {
        return yolcuKapasite;
    }

    public void setYolcuKapasite(int yolcuKapasite) {
       this.yolcuKapasite=yolcuKapasite;
    }

    @Override
    public String toString() {
        return "renk:"+getRenk() +"\n"+ "motor hacmi:"+getMotorHacmi()+
                "\n"+"marka:"+getMarka()+"\n"+"yolcu kapasitesi:"+getYolcuKapasite();

    }









    }

