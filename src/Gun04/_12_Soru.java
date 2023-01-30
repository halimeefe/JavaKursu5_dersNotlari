package Gun04;

public class _12_Soru {
    public static void main(String[] args) {
         //SORU 12: DEĞERİ 121.005F OLAN BİR FLOAT OLUŞTURUN VE YAZDIRIN.

        String deger1 ="95.205f";
        String deger2="25.799998f";
        float fdeger1 =Float.parseFloat(deger1);
        float fdeger2 = Float.parseFloat(deger2);
        float toplam= fdeger1+fdeger2;
        System.out.println("toplam = "+toplam);

        /**********************************************************************************/

        float bagis1=38.892f;
        float bagis2=82.113f;
        float toplamBagis=bagis1+bagis2;
        System.out.println("float:"+toplamBagis);



    }
}
