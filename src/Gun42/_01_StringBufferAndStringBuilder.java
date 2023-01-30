package Gun42;

import javax.jws.soap.SOAPBinding;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle="";

        cumle = cumle + "Bugün"; //+ işareti stringlerde birleştirme görevi yapar
        cumle = cumle + " hava"; // ve atama ister
        cumle+=" çok soğuk";

        System.out.println("cumle:"+cumle); // bugün hava çok soğuk
        System.out.println("cumle.concat:"+cumle.concat("fakat dün sıcaktı"));//ekleme yaptık
        System.out.println("cumle:"+cumle);// concat le ekledik ama tama yapmadık atama ister
                                           // bu yüzden ilk cümle bugün hava çok soğuk yazılır

        cumle=cumle.concat("fakat dün sıcaktı");// burada concatle birleştirdik va atama yaptık
        System.out.println("cumle:"+cumle);//ve bütün cümle eklendiği halde yazıldı

        /**********************STRİNGBUİLDER*****************************/

        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün"); // append: ekle demektir ve atama gerektirmez ve ekler
        cumle2.append("hava ");
        cumle2.append("soğuk");

        System.out.println("cumle2:"+cumle2);

        /*************** +, concat , StringBuilder  3 modelin hızını test ettik********/

        long startTime =System.currentTimeMillis();// işlemin şimdiki zamanından başlangıc zamanını çıkarcaz
        String test1="";
        for (int i = 0; i < 10000; i++)
            test1=test1+"merhaba";
        System.out.println(" + için süre:"+(System.currentTimeMillis()-startTime)+" ms");//çıkan süre bize işlem süresini vercek


         startTime =System.currentTimeMillis();// işlemin şimdiki zamanından başlangıc zamanını çıkarcaz
        String test2="";
        for (int i = 0; i < 10000; i++)
            test2=test2.concat("merhaba");
        System.out.println(" concat  için süre:"+(System.currentTimeMillis()-startTime)+" ms");//çıkan süre bize işlem süresini vercek

        startTime =System.currentTimeMillis();// işlemin şimdiki zamanından başlangıc zamanını çıkarcaz
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 10000; i++)
            test3=test3.append("merhaba");
        System.out.println(" StringBuilder  için süre:"+(System.currentTimeMillis()-startTime)+" ms");//çıkan süre bize işlem süresini vercek

         // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.


        System.out.println("************************\n\n");
        /********************StringBuilderı biraz yakından tanıyalım  ****/

        StringBuilder sb=new StringBuilder();
        sb.append("bugün");
        sb.append("hava");
        sb.append("güzel");
        System.out.println("sb:"+sb);// append larla atama yapmaya gerek kalmadan eklenen her stringi bütün olarak yazdırır
        System.out.println("*********************************************");

        System.out.println("sb.lenght:"+sb.length());// Stringin uzunluğunu verir
        System.out.println("*********************************************");

        sb.append(4);//eklenen herşeyi to string hali var ise çevirerek ekler// 4 rakamı sonuna ekledi
        System.out.println("sb:"+sb);
        System.out.println("**********************************************");

        sb.reverse();//STRİNGİ TERSİNE ÇEVİRİR
        System.out.println("sb:"+sb);
        System.out.println("************************************************");

        sb.reverse();
        System.out.println("sb:"+sb);
        System.out.println("**************************************************");

        sb.delete(0,5);//İNDEX 0 DAHİL,5 HARİÇ OLMAK ÜZERE SİLER
        System.out.println("sb:"+sb);
        System.out.println("***************************************************");

        sb.deleteCharAt(3);//SADECE BELİRTİLEN İNDEXTEKİ KARAKTERİ SİLER
        System.out.println("sb:"+sb);
        System.out.println("**************************************************** ");

        sb.insert(5,"bugün");//5 NOLU İNDEXE KELİMEYİ EKLE:ARAYA EKLEME
        System.out.println("sb:"+sb);//**************************ARAYA EKLEME*****************//
        System.out.println("******************************************************");

        sb=new StringBuilder("BUGÜN HAVA ÇOK SOĞUK");//SIFIRLAMADI VE İLK DEĞER ATANDI
        System.out.println("sb:"+sb);
        System.out.println("****************************************************");

        sb.replace(3,8,"bu");//verilen aralığı bu stringle değiştir
        System.out.println("sb:"+sb);
        System.out.println("****************************************************");

        String strSb=sb.toString();//stringi saf stringe çeviriyor

        //*******************STRİNGBUFFER*************************//

        StringBuffer sBuffer=new StringBuffer();//TAMAMEN STRİNGBUİLDER İLE
        //AYNI ÇALIŞIYOR ,
        // TEK FARKI:PARALEL ÇALIŞAN YAZILIMLARDA STRİNGBUFFER KULLANILIR,
        // ÖZEL PROGRAMLARDA MESELA OYUN PROGRAMLARINDA PARALEL ÇALIŞMAYA
        //İHTİYAÇ OLDUĞUNDA KULLANILIYOR
        // PARALEL TESTTE KULLANILIYOR




    }

}
