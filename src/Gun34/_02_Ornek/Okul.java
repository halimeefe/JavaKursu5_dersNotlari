package Gun34._02_Ornek;

public class Okul {
    public static void main(String[] args) {




       LiseOgr lo1=new LiseOgr("ismet", OgrTip.lISE,"say");
       LiseOgr lo2=new LiseOgr("MEHMET", OgrTip.lISE,"söz");
       IlkOgrencisi io=new IlkOgrencisi("ayşe",OgrTip.ilkokul,"SATRANÇ");

        System.out.println("lo1:"+lo1);
        System.out.println("lo2:"+lo2);
        System.out.println("io:"+io);



    }

}
