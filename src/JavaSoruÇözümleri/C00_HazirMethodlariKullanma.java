package JavaSoruÇözümleri;

public class C00_HazirMethodlariKullanma {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // Bu iki sayının çarpım sonucunu yeni kod yazmadan konsola yazdırın.
        System.out.println(C02_MethodOlusturIkiSayininCarpimi.carpimMethodu(a,b));

        String c="nasıl";
        String d="yani";

        // Bu iki stringi aralarında bir boşluk kullanarak yazdırınız.
        System.out.println(C03_MethodOlusturStringConcat.birlestirMethodu(c,d));

        String e="Bu da mı oldu";
        System.out.println(C04_MethodOlusturmaStringTerseCevir.stringiTerseCevirRevors(e));

        String str="Java çok güzel";

        //str'ı büyük harf oolarak yazdırın.
        System.out.println(str.toUpperCase());









    }
}
