package Gun39._03_OOP_Soru;

import javax.jws.soap.SOAPBinding;

public class ABMain {
    public static void main(String[] args) {

        A a=new A();
        System.out.println("a.mesaj:"+a.mesaj);

        B b=new B();
        System.out.println("b.mesaj:"+b.mesaj);

        A a2=new A();
        System.out.println("a2.mesaj:"+a2.mesaj);
    }

    // extend yaptığımız classta static i kaldırdığımız için
    // b clasından extend yaptığımız halde sıralama A B A OLARAK YAZDI
}
