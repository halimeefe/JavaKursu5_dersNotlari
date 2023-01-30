package Gun45;

public class Soru_15_ {
    public static void main(String[] args) {



        int data []={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;

        for (int e:data){  // 2014 geliğinde çalışmayacak ve countu 1 artıracak
            if (e !=key){  // elemanlar 2014 den farklıysa pas geç ve countu 1 artır diyor
                continue;
                //count++;// compile error verir
                          // continue dan sonra aynı parantezin içinde
                          //hiç bir şey gelemez  yani kod gelmez ve çalışmaz
            }
        }
        System.out.println(count+" Found");
    }
}
