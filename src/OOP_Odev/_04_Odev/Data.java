package OOP_Odev._04_Odev;

import com.sun.java.swing.plaf.windows.WindowsToggleButtonUI;

public abstract class Data {



     final double pi=3.14;

    public Data() {

    }


    abstract  double getArea();

    private int yariCap;
    private  int uzunluk;
    public  int  en;

    public Data(int yariCap, int uzunluk, int en) {
        setYariCap(yariCap);
        setUzunluk(uzunluk);
        setEn(en);
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }


}
















