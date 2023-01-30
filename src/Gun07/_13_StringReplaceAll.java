package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {

        // ReplaceALL: Replace gibi çalışır. farkı Kriter(regex) verilebiliyor
        //regex :regular expression / düzenli ifadeler
        //
        //  TODO ÖDEV :REGEX OLARAK NELER YAZILABİLİYOR GOOGLE DAN ARAŞTIRILACAK


        String text ="Merhaba Dünya123";

        System.out.println("text ="+ text);//orjinal hali
        System.out.println("text.replaceAll()="+ text.replaceAll("[abn]","_"));
        // a veya b veya n leri _yap ->Merh___Dü_y_123

        System.out.println("A-Z-> _ = "+ text.replaceAll("[A-Z]","_"));
        // Adan z ye kadar büyük harfleri _ yap -> -erhaba-ünya123

        System.out.println("0-9 dışındakileri -> _ ="+text.replaceAll("[^0-9]","")); // buradaki şapka dışındakiler demek

        //rakamları dışındakileri sil 123






    }
}
