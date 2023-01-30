package JavaSoruÇözümleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Soru_3_HashSet {
    public static void main(String[] args) {

//        commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//        return tipi arraylist olmalı.
//        **ÖRNEĞİN:**
//         İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//          İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//          Ortak değerleri ArrayListe ekleyiniz.
//        çıktı:  "Germany" , "Brazil" ,"USA"
//        ArrayListi yazdırınız.


        HashSet<String>hs1=new HashSet<>();
        hs1.add("Germany");
        hs1.add("England");
        hs1.add("South Africa");
        hs1.add("Brazil");
        hs1.add("USA");

        HashSet<String>hs2=new HashSet<>();
        hs2.add("Germany");
        hs2.add("China");
        hs2.add("Brazil");
        hs2.add("France");
        hs2.add("USA");

        commonValues(hs1,hs2);

    }
    public static void commonValues(HashSet<String>hs1,HashSet<String>hs2){

        ArrayList<String> dizi=new ArrayList<>();
        dizi.addAll(hs1);
        dizi.retainAll(hs2);
        System.out.println("ortak elemanlar:"+Arrays.asList(dizi));

       return ;
        }


    }

