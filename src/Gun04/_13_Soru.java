package Gun04;

public class _13_Soru {
    public static void main(String[] args) {

        //SORU 13 :DEĞERİ 123.3365F OLAN BİR FLOAT OLUŞTURUN VE YAZDIRIN.

        String deger1="120.000f";
        String deger2="3.3365f";
        float fdeger1 = Float.parseFloat(deger1);
        float fdeger2= Float.parseFloat(deger2);
        float sonuc= fdeger1+fdeger2;
        System.out.println("sonuc="+sonuc);

        /************************************************************************/

        float makbuz1=47.5023f;
        float makbuz2 =75.8342f;
        float toplamMakbuz=makbuz1+makbuz2;
        System.out.println("float:"+toplamMakbuz);



    }
}
