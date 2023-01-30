package OOP_Odev._04_Odev;

public class Rectangle extends Data{


    public Rectangle(int yariCap, int uzunluk, int en) {
        super(yariCap, uzunluk, en);
    }

    @Override
    double getArea() {
        return getUzunluk()*getEn();
    }

    @Override
    public int getUzunluk() {
        return super.getUzunluk();
    }

    @Override
    public void setUzunluk(int uzunluk) {
        super.setUzunluk(uzunluk);
    }

    @Override
    public int getEn() {
        return super.getEn();
    }

    @Override
    public void setEn(int en) {
        super.setEn(en);
    }


}



