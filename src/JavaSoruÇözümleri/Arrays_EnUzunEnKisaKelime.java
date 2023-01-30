package JavaSoruÇözümleri;

public class Arrays_EnUzunEnKisaKelime {
    public static void main(String[] args) {


        // Verilen String bir array deki
        // en uzun ve en kısa kelimeleri yazdıran bir method oluşturun




        String[]dizi = {"Hasan", "Adem", "Sntürk", "Ömer Faruk"};
        enUzunEnKisaIsimleriYazdir(dizi);
    }
    public static void enUzunEnKisaIsimleriYazdir(String[]dizi){
        String enUzunKelime=dizi[0];
        String enKisaKelime=dizi[0];

        for (int i=1; i<dizi.length;i++){

            if (dizi[i].length()>enUzunKelime.length()) {
                enUzunKelime = dizi[i];
            }
            if (dizi[i].length()<enKisaKelime.length()){
                enKisaKelime=dizi[i];

            }
        }
        System.out.println("en uzun isim:"+enUzunKelime);
        System.out.println("en kısa isim:"+enKisaKelime);



    }
}
