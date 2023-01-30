package Gun29._02_PrivateErisim;




public class Sirket {
    public static void main(String[] args) {


        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="ismet";
        cal1.surname="Temur";
        //cal1.password="1234";
        //artı private kendi paketinden
        //bile çağrılamaz

        cal1.sifreAta("1234");// ZAYIF ŞİFRE ÇÜNKÜ EN AZ 8 KARAKTER OLSUN İSTEDİK
        cal1.sifreAta("M123_sdf23");
        cal1.sifreGoster();


    }
}
