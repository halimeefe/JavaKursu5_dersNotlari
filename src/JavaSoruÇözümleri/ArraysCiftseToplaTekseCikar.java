package JavaSoruÇözümleri;

public class ArraysCiftseToplaTekseCikar {
    public static void main(String[] args) {




        //int Array oluşturun ve elemanları : 5,6,8,12,14,19

        // Eğer sayı çiftse topla, tekse çıkar.

        // **Örneğin:**

        //**-5 + 6 + 8 + 12 + 14 - 19 = 16**

        //Toplamlarını yazdırın.


        int[] dizi = {5, 6, 8, 12, 14, 19};
        int total = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                total += dizi[i];

            } else
                total -= dizi[i];

        }
        System.out.println("sonuç:"+total);




    }
}
