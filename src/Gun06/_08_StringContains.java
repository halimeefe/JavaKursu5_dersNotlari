package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        //contains: bir stringin içerisinde karakter(lerin) var olup
        //olmadığını boolean cinsinden söyle true veya false demektir

        String cumle ="Merhaba Dünya";

        boolean varMi= cumle.contains("a");
        System.out.println("varMi ="+varMi);

        //DİREKT DE YAPABİLİRSİNİZ

        System.out.println("varMi = "+cumle.contains("a"));

        System.out.println(" ya VarMi = "+ cumle.contains("ya"));





    }
}
