package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {




        Ogrenci ogr1=new Ogrenci();// nesne burda oluşuyor

        //1.yol
        ogr1.id=1;// özelliklerinin değerlerini burada veriyoruz//ad ,isim,sınıf ve ayrıntılı bilgiler
        ogr1.ad="İsmet";
        ogr1.soyad="Temur";
        ogr1.sinifi=5;
        System.out.println("ogr1 ad="+ogr1.ad);


        //2.yol
        Ogrenci ogr2=new Ogrenci(2,"MEHMET","YILMAZ",5);// constructor dan sonra böyle, bir, kalemde de tanımlama yapabiliriz
        System.out.println("ogr2.ad:"+ogr2.ad);

        Ogrenci ogr3=new Ogrenci(2,"ayşe","Bayrak");

    }
}
