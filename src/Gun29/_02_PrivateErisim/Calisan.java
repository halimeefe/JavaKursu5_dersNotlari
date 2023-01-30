package Gun29._02_PrivateErisim;

public class Calisan {
    int id;// FİELD LARIN BAŞINA BİRŞEY YAZMAYINCA DEFAULT OLUYOR SADECE KENDİ PAKETİ ÇAĞIRABİLİR
    String name;
    String surname;
    private  String password;  //***//private// PASSWORD FİELD I PRİVATE OLDUĞU İÇİN KENDİ PAKETİ BİLE ERİŞEMEZ

 public void  sifreAta(String sifre) {// BURAYI PUBLİC YAPIP HERKES ERİŞSİN VE ŞİFRE ATASIN DİYE METOD YAPTIK
                                      //sifreyi kontrol ederek atayacağım// KONTROL EDEREK ATAYACAĞIZ
      if (sifre.length() < 8) {
         System.out.println("zayıf şifre");
     } else {
         password = sifre;// YANİ BİZİM KOYDUĞUMUZ KURALA GÖRE ŞİFRE YAZMALI
         System.out.println("sifre başarıyla atandı");
     }
 }
 public void sifreGoster()

 {
     System.out.println("*****"+password.substring(4));
 }
}
