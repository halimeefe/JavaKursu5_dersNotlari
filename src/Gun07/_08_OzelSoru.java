package Gun07;

import java.util.Scanner;

public class _08_OzelSoru {
    public static void main(String[] args) {



        //Girilen bir cümledeki kelimelerin ilk harflerini yazdırınız.



        Scanner oku = new Scanner(System.in);
        System.out.print("cumleyi giriniz: ");
        String isimKodu = oku.nextLine();
        //System.out.println("ilk harfler: " + cumleGirdisi.replaceAll("\\B\\S",""));



        String a=isimKodu.replaceAll("\\B\\S","");
        System.out.println(a.toUpperCase().replace(" ",""));


        // ismi a ya atadık ve baş harflerini aldık
        System.out.println(a.toUpperCase().replace(" ",""));          // küçük harfle girse bile büyüğe çevirecek ve boşlukları silecek




      //  System.out.println(cumleGirdisi.replaceAll("\\s",""));** bütün string ifadeyi bpşluksuz yazar
       // System.out.println("\\d(?=(?:\\D*\\d){2})","*"));*** telefon numarası maskelemek için regex

//        String a= adSoyad.replaceAll("\\B\\S", "");
//        System.out.println(a.toUpperCase().replace(" ", ""));
//        this.isimKodu = this.Departman.getDepartmanKodu() + (id++) + a;
//        return this.isimKodu;











    }
}
