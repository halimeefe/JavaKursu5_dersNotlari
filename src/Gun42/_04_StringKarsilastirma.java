package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {

        //STRİNGLERDE NEDEN == YERİNE EGUAL KULLANILIYOR
        String cumle1="bugün hava çok güzel";
        String cumle2="bugün hava çok güzel";

        // İLKEL TİPLERİ KARŞILAŞTIRDIĞINDAN 2 SİN DE DE DEĞERLERİ KARŞILAŞTIRIR
        // ÇÜNKÜ BAŞKA BİR ŞEYİ YOK // EŞİTEŞİT KULLANIMI BU ŞEKİLDE YANİ SADECE DEĞERLERE BAKAR MATEMATİKSEL OLARAK
        //

        if (cumle1 ==cumle2)
            System.out.println("cumle 1 cumle 2 ye eşit"); //İLKEL TİPLERİ KARŞILAŞTIRIYOR EŞİTEŞİT YANİ DEĞERLERİ
        else
            System.out.println("cumle 1 cumle 2 ye eşit değil");

        if (cumle1.equals(cumle2))
            System.out.println("cumle 1 cumle 2 ye eşit");  //
        else
            System.out.println("cumle 1 cumle 2 ye eşit değil");

        //*****************REFERANS TİPLERDE İSE DURUM**************//
        //SCANNER LA EKRANDAN OKUNDUĞUNDA AŞAGIDAKİ GİBİ OLUYOR*************//STRİNG BUİLDER***********//
        String cumle3=new String("BUGÜN HAVA ÇOK GÜZEL"); // KONSOLDAN OKUTUNCA REFERANS TİP OLDU SCANNERLA OKUTTUĞUMUZ GİBİ
        String cumle4=new String("BUGÜN HAVA ÇOK GÜZEL");  // ÇÜNKÜ NESNE TÜRETTİK NEW YAPTIK

        if (cumle3 == cumle4)//
            System.out.println("CUMLE3 CUMLE4 E EŞİT"); // adresleri aynımı referansları karşılaştırır
        else
            System.out.println("cumle3 cumle 4 eşit değil");

        if (cumle3.equals(cumle4))// değerleri aynımı diye bakmış oluruz
            System.out.println("cumle 3 cumle4 e eşit");
        else
            System.out.println("cumle3 cumle4 e eşit değil");

    }
}
