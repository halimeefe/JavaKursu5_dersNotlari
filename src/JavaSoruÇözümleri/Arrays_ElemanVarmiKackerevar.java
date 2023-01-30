package JavaSoruÇözümleri;

public class Arrays_ElemanVarmiKackerevar {
    public static void main(String[] args) {


        // verilen bir array de istenen bir elemanın
          //var olup olmadığını ve
                // varsa kaç kere kullanıldığını yazdırınız,

        int[]dizi={1,2,4,5,3,6,7,4,2,3,5,1,3,2};

        int arananEleman=2;  // 2 var mı  varsa kaç tane var

        int sayac=0;
        for (int i=0; i< dizi.length; i++){
            if (dizi[i]==arananEleman){
                sayac=sayac+1;

            }
        }
        if (sayac==0){
            System.out.println("aranan sayı array de yok");

        }else
            System.out.println("aranan" + arananEleman  + "sayısı, arrayde"  + sayac + "tane  var");




    }
}
