package JavaSoruÇözümleri;

public class BirlerBasamagiBulma {
    public static void main(String[] args) {


        //100 e kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz


        int sayac = 1;
        int adet=0;
        while (sayac <= 100){
            if(sayac % 10 == 5 ){
                adet++;
            }
            sayac++;
        }
        System.out.println("adet = " + adet);


    }
    }
















