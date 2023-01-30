package Gun45;

public class Soru_14_ {
    public static void main(String[] args) {



        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;


        numbers=new int[4];// burada yeni dizi oluşturuluyor ve yukardaki sıfırlanıyo
        numbers[2]=30;// integerda default değer sıfır dır
        numbers[3]=40; // bu yüzden de 1.ve 2. sıraya 0 atar
             for (int n: numbers){
                 System.out.println(" "+n);//cevap 0/0/30/40 olur
             }

    }
}
