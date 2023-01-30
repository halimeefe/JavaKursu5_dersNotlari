package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {


        int s1 = 4;
        int s2 = 12;
        int s3 = 34;

        int sonuc1 = toplamBul(s1, s2);//**FONKSİYON İSİMLERİ AYNI OLABİLİR PARAMETRELERDEN AYIRT EDİLİR
        int sonuc2 = toplamBul(s1, s2, s3);

        String ad = "İsmet";
        String soyAd = "Temur";
        String sonuc3 = toplamBul(ad, soyAd);

        System.out.println( "toplam:"+toplamBul(s1,s2));
        System.out.println("toplam:"+toplamBul(s1,s2,s3));
        System.out.println("AD VE SOYAD:"+ad+" "+soyAd);

    }
    public static int toplamBul(int s1, int s2) {
        return s1 + s2;

    }

    public static int toplamBul(int s1, int s2, int s3) {

        return s1 + s2 + s3;
    }

             public static String toplamBul(String ad,String soyAd){

        return ad+" "+soyAd;
    }


}
