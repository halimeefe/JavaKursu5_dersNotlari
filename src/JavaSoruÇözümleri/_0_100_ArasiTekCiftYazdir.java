package JavaSoruÇözümleri;

public class _0_100_ArasiTekCiftYazdir {
    public static void main(String[] args) {



        //0 ile 100 arasındaki sayıları kapsayan bir kod yazınız.
       // Bu kod sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.
        //Eğer sayı çift sayıysa;  **This number is even and number is 0**
        //Eğer sayı tek sayıysa;  **This number is odd and number is 1** yazdırmalıdır.

        for (int i = 0; i <= 100 ; i++) {
            if(i % 2 == 0){
                System.out.println("This number is even and number is " + i);
            }else {
                System.out.println("This number is odd and number is " +  i);
            }
        }



    }
}
