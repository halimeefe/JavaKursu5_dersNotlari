package Gun08;

public class _02_JavaAritmetichOperatorsSayac {
    public static void main(String[] args) {

        int sayac=0;

        sayac=sayac+1;// sayacın değerini 1 tane artırıryor:  1
        sayac++;     //sayacın değerini 1 tane artırıyor:2
        ++sayac;     //sayacın değerini 1 tane artırıyor:3

        sayac=sayac-1;    // sayacın değerini bir azaltır:2
        sayac--;          //sayacın değerini 1 azaltır:1
        --sayac;         // sayacın değerini 1 azaltır:0
        System.out.println( "sayac="+sayac);



        /****************************************************************/
        int toplam =5+ sayac; // 5 olur
        System.out.println("toplam="+toplam);  //5
        System.out.println("sayac="+sayac);   //0

        toplam = 5+  sayac++;  // toplam=5+sayac sonra sayac=sayac+1
        //toplam=5 ve sayac=1 oldu
        System.out.println(" toplam ="+toplam);//5
        System.out.println("sayac="+sayac);//1

        toplam= 5+  ++sayac ;  //sayac=sayac+1 sonra toplam =5+sayac 7 olur
        System.out.println("toplam ="+toplam);//7
        System.out.println("sayac ="+ sayac);//2

        // özet: ++ lar sağda ise önce işlem ,sonra sayac  artış
        //       ++ lar solda ise önce sayac  artış ,sonra işlem







    }
}
