package Gun30._02_FinalVariables.Ornek_1;

public class NufusMemurlugu {
    public static void main(String[] args) {


        Vatandas v1=new Vatandas("ismet");
        Vatandas v2=new Vatandas("NAZMİYE");
        Vatandas v3=new Vatandas("NURHAYAT");

        System.out.println("v1:"+v1);
        System.out.println("v2:"+v2);
        System.out.println("v3:"+v3);

        //v1.tcno:456;
        //final değişkenlerine sadece 1 kez veri atanabilir
        // oda ya tanımlanırken,ya da constructor da

        final double pi=3.14;
       // pi=5;**sonradan değiştirilmez


    }
}
//finaldeğer atandıktan sonra değiştirilmeyi engelliyor
//static sayac ise: her yeni nesne oluşturulduğunda
//yeni artan değer almasını sağlıyor