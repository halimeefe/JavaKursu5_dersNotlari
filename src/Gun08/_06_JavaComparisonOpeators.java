package Gun08;

public class _06_JavaComparisonOpeators {
    public static void main(String[] args) {

        // Birbirine eşitmi yada farklımı sorusunu sordurur ve cevabı boolean olarak verir.
        // Evet ise true
        //Hayır ise false sonucunu verir
        // sadece stringlede kullanılır.

        int a=50;
        int b=50;

        // = atama işareti ,   == eşit mi?
        System.out.println("a b ye eşit mi ? "+ (a == b ) );  // true
        System.out.println(" a b den farklı mi ?"+(a != b ) );// false => != bu işaret farklımı anlamı verir.

        System.out.println("a b den büyük mü?" +(a>b) );// false
        System.out.println("a b den küçük mü?"+ (a<b) );//false

        System.out.println("a b den büyük veya eşit mi?"+(a>=b) );// true
        System.out.println(" a b den küçük veya eşit mi ?"+(a<=b) );// true




    }
}
