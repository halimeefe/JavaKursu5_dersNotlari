package Gun39._01_OOP_Soru;

public abstract class Hayvan {

    private final int id;
   private String name;
   private boolean vahsi;
   private String dTarih;

   abstract  public void yiyecegi();
 abstract public void yemekMiktari();
 abstract  public void gunlukUykuSuresi();
 abstract public void sesi();

 private static int sayacId=1;

    public Hayvan( String name, boolean vahsi, String dTarih) {
        this.id = sayacId++;
        setName(name);
        setVahsi(vahsi);
        setdTarih(dTarih);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getdTarih() {
        return dTarih;
    }

    public void setdTarih(String dTarih) {
        this.dTarih = dTarih;
    }

    public static int getSayacId() {
        return sayacId;
    }


    @Override
    public String toString() {
        System.out.print("yiyeceği:");yiyecegi();
        System.out.print("yemek miktarı:");yemekMiktari();
        System.out.print("uyku süresi");gunlukUykuSuresi();
        System.out.print("sesi:");sesi();

        return "Hayvan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vahsi=" + vahsi +
                ", dTarih='" + dTarih + '\'' +
                '}';
    }
}







