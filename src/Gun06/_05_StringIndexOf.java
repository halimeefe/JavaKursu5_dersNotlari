package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        //01234 : harflerin oda numaraları 0 dan başlar: index


        String cumle = "Merhaba Dünya";


        System.out.println("cumle.indexOf(m)=" + cumle.indexOf("M"));//0
        System.out.println("cumle.indexOf(a)=" + cumle.indexOf("a"));//04
        System.out.println("cumle.indexOf(ha)=" + cumle.indexOf("ha"));//3
        System.out.println("cumle.indexOf( )=" + cumle.indexOf(" "));////7
        System.out.println("cumle.indexOf(A)=" + cumle.indexOf("A"));//-1
        System.out.println("cumle.indexOf(a,5)=" + cumle.indexOf("a",5));//6
        // a yı aramaya 5 (dahil) no lu index ten sonra başla


    }
}
