package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {


        Cember c=new Cember();
        c.ciz();// cember cizildi

        Dikdortgen d=new Dikdortgen();
        d.ciz();//dikdörtgen cizildi


        //interface lerden nesne üretilemez fakat referans tipi
        //oluşturulabilir.Bu bize polymorphizm sağladı
        ICizdirir c2=new Cember();
        c2.ciz();//cember cizildi
        // direk olarak sadece ınterface deki
        //ismi verilmiş olanlar metodlara erişebilirsin


        cizdirme(c);// bu metodları kendimiz mainde yaptık
        cizdirme(d);//POLYMORPHİZM GİBİ MAİNDE METOD YAZDIK

    }public static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }//İNTERFACE İDE POLYYMORPHİSİM GİBİ KULLANABİLİYORUZ
}
