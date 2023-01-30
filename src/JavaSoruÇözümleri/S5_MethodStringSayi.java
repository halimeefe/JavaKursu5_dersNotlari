package JavaSoruÇözümleri;

import java.util.WeakHashMap;

public class S5_MethodStringSayi {
    public static void main(String[] args) {


        // EvenOddNums isminde bir method oluşturun.

        // Bu yöntem String olan bir parametreyi kabul etsin.

        // Bu String'de 1234567890 gibi 10 haneli sayılar olacak.

        // Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.

        //toplam sonucu yazdırın.

        //İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**

        // For example Örnek:

        // String =  "6678421312"

        // 6+6-7+8+4+2-1-3-1+2

        // sonuç 16 olmalı


        String sy = "6678421312";
        EvenOddNumber(sy);


        }
        public static void EvenOddNumber(String strSy)
        {
            long intSy=Long.parseLong(strSy);
            int toplam=0;
            do {
                if ((intSy % 10)% 2 ==0)
                    toplam+=intSy%10;
                else
                    toplam-=intSy % 10;
                intSy /=10;
            }while (intSy > 0);
            System.out.println(toplam);


        }
}


















