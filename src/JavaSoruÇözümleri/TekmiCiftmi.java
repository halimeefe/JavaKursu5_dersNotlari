package JavaSoruÇözümleri;

public class TekmiCiftmi {
    public static void main(String[] args) {





        //0 ile 100 arasındaki sayıları kapsayan bir kod yazınız
        //bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek
        //eğer sayı çifse;
        //**This number is even and number is 0**
        // Eğer tek se;
        //**this number is odd and number is 1**
        // yazdırmalıdır.

        int sayac=0;
        while (sayac<=100){
            sayac++;
            if (sayac%2==0){
                System.out.println("çifttir:"+sayac);
            }else
                System.out.println("tektir:"+sayac);
        }

    }
           //int i = 0;
           //for ( i=0; i<=100; i++){
          // if (i % 2 ==1)
           // System.out.println("This number is even and number = "+i);
           // else
           // System.out.println("This number is odd and number is = "+i);
    }

