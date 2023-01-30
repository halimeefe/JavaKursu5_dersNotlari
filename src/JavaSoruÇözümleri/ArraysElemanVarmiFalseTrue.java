package JavaSoruÇözümleri;

public class ArraysElemanVarmiFalseTrue {
    public static void main(String[] args) {



        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple

        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.

        //Eğer aitse "true" çevirin.

        // Loops (döngüler) kullanın.
        int i = 0;


        String[] dizi = {"Apple", "Orange", "Banana", "Pineapple"};

        for (i = 0; i < dizi.length; i++) {
            boolean varMi = dizi[i].contains("Apple");


            System.out.println("Array de'Apple'Var mı:" + varMi);//SONUNA BREAK KOYARSAK HEPSİNİ ARAMAZ

            //**************************************************************//

            String[]arr={"grape","strawbery","mango"};
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase("mango")){
                }

            }
            System.out.println(true);

        }





    }
}
