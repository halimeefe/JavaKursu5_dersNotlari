package Gun28._02_Constructor;

public class Kitapcı {
    public static void main(String[] args) {

        // Book class yazınız.fields: name,publishYear(yayın yılı),author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        Book bk1=new Book();
        bk1.name="Harry poter";
        bk1.author=" jk rowling";
        bk1.publishYear=1997;

        Book bk2=new Book("YÜZÜKLER",1954,"JRR TOLKİEN");
        Book bk3=new Book("ÜZÜM VE ÇAY",2000);

        System.out.println("kit1:"+bk1);
        System.out.println("kit2:"+bk2);
        System.out.println("kit3:"+bk3);





    }
}
