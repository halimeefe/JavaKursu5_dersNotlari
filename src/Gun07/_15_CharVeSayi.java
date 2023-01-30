package Gun07;

public class _15_CharVeSayi {
    public static void main(String[] args) {


        // bilgisayar sayıları saklayabiliyor ama harf ve karakterleri saklayamaz
        // bu yüzden harf ve karakterleri sayıya çevirebiliriz ascii tabloyla
        //0 dan 255 e kadar karakter  sayıları vardır



        int sayi=65;
        System.out.println("sayi:"+sayi);
        char harf=(char) sayi;
        System.out.println("harf:"+harf);

        sayi=97;
        harf=(char) sayi;
        System.out.println("harf="+harf);

        for (int i=0; i<=255;i++)
        {
            harf=(char) i;
            System.out.println(i+".harf :"+harf);

        }



    }


}
