package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {

        //equals : 2 stringin birbirine eşit olup olmadığını kontrol eder
        // sonuç boolean




       String  s1="Merhaba";
       String s2="MERHABA";

      boolean esitMi= s1.equals(s2);//1. yöntem
        System.out.println("eşit mi ="+ esitMi);

        System.out.println("s1.equals(s2)="+ s1.equals(s2));//2.yöntem

        System.out.println("s1.equals(Merhaba)="+s1.equals("Merhaba"));//3.yöntem





    }

}
