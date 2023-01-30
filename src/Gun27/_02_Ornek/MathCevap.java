package Gun27._02_Ornek;

import javax.jws.soap.SOAPBinding;

public class MathCevap {
    public static void main(String[] args) {

        int max =MyMath.getMax(4,6);
        int min=MyMath.getMin(4,6);
        int rnd=MyMath.getRandom(10);
        double usSonuc=MyMath.getUsAl(2,3);
        double kareKok=MyMath.getKareKok(16);

        System.out.println("max:"+max);
        System.out.println("min:"+min);
        System.out.println("rnd:"+rnd);
        System.out.println("us sonuç:"+usSonuc);
        System.out.println("karekok:"+kareKok);







    }
}
