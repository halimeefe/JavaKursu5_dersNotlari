package Gun36._05_Interface;

public class Test implements IYazdirir,IGosterir{


    // implement yaptığımız clastan ortak olan metodları alıyor



    @Override
    public void goster() {
        System.out.println("gösterdi");

    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);

    }

    @Override
    public void yaz() {
        System.out.println("yazdırdı");


    }
}
