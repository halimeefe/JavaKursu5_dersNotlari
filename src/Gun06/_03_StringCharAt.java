package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // istenilen noktadaki karakteri verir
        // karakterlerin sırası 0 dan başlar ve buna index denir.

        String cumle= "Merhaba Dünya"; //lenght 13 ama karkaterlerin odası 0-12 dahil

        char ilkHarf =cumle.charAt(0); // 0 index teki harfi ver demektir.
        System.out.println("ilkHarf ="+ilkHarf);

        int uzunluk=cumle.length();
        System.out.println("uzunluk:"+uzunluk);








    }
}
