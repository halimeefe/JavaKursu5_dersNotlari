package Gun36._06_Interface;

public class Kare  extends Dikdortgen{

    // karede kısa kenar uzun kenar olmadığı için
    // dikdörtgen clasından extend yaptık
    //ve metodları kendimiz doldurduk


  public int alan(int kenar){
      return super.alan(kenar,kenar);

  }

   public int cevre(int kenar)
   {
      return super.cevre(kenar,kenar);
   }
}


