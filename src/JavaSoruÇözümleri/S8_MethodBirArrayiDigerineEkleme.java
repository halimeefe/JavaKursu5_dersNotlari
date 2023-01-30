package JavaSoruÇözümleri;

import java.util.Arrays;

public class S8_MethodBirArrayiDigerineEkleme {
    public static void main(String[] args) {

    //append adında bir method oluşturun.`
        //Parametre olarak iki int array  oluşturun.`
        //ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        //Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        // Bunu döndürmelidir:
        // {2, 4, 6, 1, 2, 3, 4, 5}.


        int[]arr1={2,4,6};
        int[]arr2={1,2,3,4,5};
        int[] sonuc = new int [arr1.length + arr2.length];

        for (int i=0; i<arr1.length + arr2.length; i++)
        {
            if (i<arr1.length)
                sonuc[i]=arr1[i];
            else
                sonuc[i]=arr2[i-arr1.length];
        }

        Arrays.sort(sonuc);

        System.out.println("ilk dizi:"+Arrays.toString(arr1));
        System.out.println("ikinci dizi:"+Arrays.toString(arr2));
        System.out.println("Birleştirilmiş dizi:"+ Arrays.toString(sonuc));

        System.out.println();
        //***************************************************************************************//

        int[] dizi1={2,4,6};
        int[] dizi2={1,2,3,4,5};
        System.out.println(Arrays.toString(append(dizi1,dizi2)));
    }
    public static int[] append(int[] dizi1, int[] dizi2)                      //METODLU YAPILMIŞ HALİ
    {
        int[] diziBirlesik = new int[dizi1.length+dizi2.length];
        for (int i = 0; i < dizi1.length; i++) {
            diziBirlesik[i]=dizi1[i];
        }

        int index=0;
        for (int i = dizi1.length; i <diziBirlesik.length; i++) {
            diziBirlesik[i]= dizi2[index];
            index++;
        }
        return diziBirlesik;




    }
}
