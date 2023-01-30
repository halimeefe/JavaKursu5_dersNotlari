package JavaSoruÇözümleri;

public class Arrays_PozitifTamSayiToplama {
    public static void main(String[] args) {



        //verilen bir arry deki pozitif tam sayıları toplayıp
        // sonucu bize döndüren bir method yazınız.








        int[]dizi={3,-8,5,-4,1,-2};

        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > 0) {
                toplam = dizi[i] + toplam;

            }
        }
        System.out.println(toplam);

    }
}
