package Gun30;

public class GununSorusu {

    int a;
    static int b=0;// statik olduğu için bir tanedir 2 tane olmaz ve en son verilen değeri kabul eder

    void artir()
    {
        a++;
        b++;
    }


    public static void main(String[] args) {

        GununSorusu gs1=new GununSorusu();
            gs1.a=5;

            GununSorusu gs2=new GununSorusu();
            gs2.a=7;

            //a nın değeri kaç oldu şu anda:Burada verilecek cevap hangi a olmalı
            //Burada her nesnenin a sı var ve gs1 in 5,gs2 nin ise 7 değeri var
            System.out.println("gs1a :"+gs1.a);
            System.out.println("gs2:"+gs2.a);

            //SORU:b nin değeri kaötır: tek bir değeri vardır oda en son değer
            System.out.println("gunun sorusu:"+GununSorusu.b);

            gs1.artir();// gs1.a -> 6 ,b=1
            gs2.artir();// gs2.a ->8 , b=2
        // soru a nın ve b nin en son değerleri kaçtır.
        System.out.println("s1.a:"+gs1.a);
        System.out.println("s2.a:"+gs2.a);
        System.out.println("b:"+b);























        }
}
