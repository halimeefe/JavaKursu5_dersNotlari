package JavaSoruÇözümleri;

public class _3_Ve_7_yeBolunenSayilar {
    public static void main(String[] args) {


        //// 0 dan 100 arasında hem 3 e hem de 7 ye bölünebilen sayıları yazdırın
        int i = 1;
        for (i = 1; i < 100; i++) {
            if (i%3 ==0 && i%7==0) {
                System.out.println(" 3 ve 7 ye bölünebilen sayılar:"+i);
            }
        }
    }
}


