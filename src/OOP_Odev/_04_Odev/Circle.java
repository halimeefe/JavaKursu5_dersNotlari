package OOP_Odev._04_Odev;

public class Circle extends  Data {


    public Circle(int yariCap, int uzunluk, int en) {
        super(yariCap, uzunluk, en);
    }

    public Circle() {
        super();
    }


    @Override
    double getArea() {
        return pi * getYariCap() * getYariCap();

    }

    @Override
    public int getYariCap() {
        return super.getYariCap();
    }

    @Override
    public void setYariCap(int yariCap) {
        super.setYariCap(yariCap);
    }


}



















