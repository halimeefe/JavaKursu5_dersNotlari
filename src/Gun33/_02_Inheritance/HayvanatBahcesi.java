package Gun33._02_Inheritance;

import com.sun.org.apache.xpath.internal.operations.Or;

public class HayvanatBahcesi {

    //Bir hayvanat bahçesi için bir program yazılmak isteniyor.
    //kediler için (renk,kilo,cins)
    //köpekler için(renk ,kilo,cins)
    //yılanlar için(renk,kilo,cinsi,uzunluk)
    // ordek için (renk ,kılo,cins ,kanat açıklığı)
    //bütün hayvanların konuştu metodu vardır.(ses çıkardı)


    public static void main(String[] args) {
        Kopek kopek1=new Kopek("BEYAZ",50,"KANGAL");
        System.out.println("kopek1:"+kopek1);

        kopek1.konustu();

        Kedi kedi1=new Kedi("BEYAZ",3,"SCOTCHY");
        System.out.println("kedi1:"+kedi1);


        kedi1.konustu();// burda superın konuştu metodunu kullandı

        Ordek ord1=new Ordek("SARI",5,"PEKİN",90);
        System.out.println("ordek:"+ord1);

        ord1.konustu();

        Yilan y=new Yilan("GRİ",2,"ANAKONDA",5);
        System.out.println("yılan:"+y);

        y.konustu();






    }
}
