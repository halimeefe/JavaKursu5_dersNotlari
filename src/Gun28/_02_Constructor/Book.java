package Gun28._02_Constructor;

public class Book {
String name;
int publishYear;
String author;

    public Book ()// BU OLMASI GEREKİYOR  ÇÜNKÜ MAİNDE İÇİNİ DOLDURUYORUZ YENİ BİR NESNE OLUŞTURUYORUZ
    {
       this("",0,"");//BURAYI YAZMASAKTA OLURDU

    }
    public Book(String name,int publishYear,String author)// 1.CONSTRUCTOR
    {
        this.name=name;//yukarda tanımlanan name ve parametredeki name
        this.author=author;// yukarda tanımlanan author ve parametredeki author
        this.publishYear=publishYear;// aynı şekilde
    }

    public Book(String name,int publishYear)//2.CONSTRUCTOR
    {
        this(name,publishYear,"");

    }

    public  String toString()  //3.CONSTRUCTOR
    {
        return name+" "+author+" "+publishYear;

    }

}
