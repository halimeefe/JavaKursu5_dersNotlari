package Gun09;

public class MntringOdev1 {
    public static void main(String[] args) {


        String givenString = "8 8 Bi fk8h B 8 BB8B B B B888 c hl8 BhB fd";

      // Verilen String de bosluklari kaldirarak ekrana yeniden yazdiriniz...
      // String methodlarindan uygun olanini kullaniniz...


        String s1="8 8 Bi fk8h B 8 BB8B B B B888 c hl8 BhB fd";

        String karakter=s1.replace(" ","");
        System.out.println("Birleşik String="+karakter);

        //
        String tamAd= "İsmetTemur";
        String ad=tamAd.substring(0,5);
        String soyAd=tamAd.substring(5,10);
        System.out.println("Orjinal hali :"+tamAd);
        System.out.println(ad+" "+soyAd);
















    }



}
