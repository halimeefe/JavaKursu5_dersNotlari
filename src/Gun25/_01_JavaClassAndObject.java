package Gun25;

public class _01_JavaClassAndObject {

    // metodların yazıldığı yer
    public static void main(String[] args) {// başla
        //ana programın başladığı ve çalıştığı yer
        int sayi=5;

        Araba benimArabam=new Araba();//ARABA TÜR,TİP ADI,BENİM ARABAM NESNE

        benimArabam.marka="BMW";
        benimArabam.renk="beyaz";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2000;

        System.out.println("benim arabamın yılı:"+benimArabam.yili);
        System.out.println("benim arabamın motorhacmi:"+benimArabam.motorHacmi);
        System.out.println("benim arabamın rengi:"+benimArabam.renk);
        System.out.println("benim arabamın markası:"+benimArabam.marka);


    }//dur

    //metodalrın yazıldığı yer//public static

}
//class-tiplerin tanımlandığı yer

class Araba   {  //classlar ın yani tiplerin tanımlandığı yer tipin adı araba
    String renk;
    int yili;
    String marka;
    int motorHacmi;


        }



