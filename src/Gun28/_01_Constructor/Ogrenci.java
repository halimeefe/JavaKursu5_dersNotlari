package Gun28._01_Constructor;

public class Ogrenci {

    int id;
    String ad;
    String soyad;
    int sinifi;

  public   Ogrenci(){ //YAPICI METODLAR: CONSTRUCTOR METODLAR***İLK OLUŞMA ANINDA KULLANILAN METODLAR
      System.out.println("nesne oluşturuldu");
      // nesne oluşturulurken yapmak istediklerin için burayı kullan

  }public Ogrenci(int id,String ad,String soyad,int sinifi){// classtan atama bu şekilde yaptık
        this.id=id;                                            //3-4 PARAMETRE VARSA BU ŞEKİLDE MAİNDE
        this.ad=ad;                                            //TEK KALEMDE YANİ TEK SATIRDA TANIMLAYABİLİRİZ
        this.soyad=soyad;
        this.sinifi=sinifi;

  }
         public Ogrenci(int id,String ad,String soyad){
      this(id,ad,soyad,0);// this yukarıda yaptığımız öğrenci metodunun kendisi,bu şekilde kısaca da metod yazabiliriz

  }
}
