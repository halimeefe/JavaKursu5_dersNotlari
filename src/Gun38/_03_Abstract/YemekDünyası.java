package Gun38._03_Abstract;

import com.sun.org.apache.xpath.internal.operations.Neg;

public class YemekDünyası {


    public static void main(String[] args) {



        Baklava b=new Baklava();
        b.madeIn();
        b.taste();
        System.out.println("******************");

       CheseCake c=new CheseCake();
        c.madeIn();
        c.taste();
        System.out.println("********************");

        GreekSalad g=new GreekSalad();
        g.madeIn();
        g.taste();
        System.out.println("********************" );

        SezarSalad s=new SezarSalad();
        s.madeIn();
        s.taste();





    }

    }
