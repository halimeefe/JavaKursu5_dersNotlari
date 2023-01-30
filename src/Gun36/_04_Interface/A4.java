package Gun36._04_Interface;

public class A4 implements IYazdirir,IGösterir{


    //1 class 1 den fazla ınterface implement edebilir
    //hem karasal hem uydu
    @Override
    public void goster() {
        System.out.println("gösterdi");

    }

    @Override
    public void yazdir() {
        System.out.println("yazdırdı");

    }
}
