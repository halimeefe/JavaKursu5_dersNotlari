package JavaSoruÇözümleri;

import javax.jws.soap.SOAPBinding;
import java.util.LinkedHashSet;

public class Soru_4_HashSet {
    public static void main(String[] args) {

//        removing() isminde bir method oluşturun.
//        Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//       Eğer Stringler LinkedHashset 'in içinde varsa, sil.
//        Return tipi linkedhashset
//        Örneğin,
//        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//        String 1= Germany
//        String 2 = USA
//                **Germany ve USA 'i sil.**
//                Set'i döndür.

        LinkedHashSet<String>  ulk=new LinkedHashSet<>();
        ulk.add("Germany");
        ulk.add("France");
        ulk.add("USA");
        ulk.add("Canada");
        ulk.add("Mexico");
        ulk.add("Brazil");
        System.out.println(ulk);

        String s1="Germany";
        String s2="USA";
        System.out.println(s1+" "+s2);


        removing(ulk);




    }public static void removing(LinkedHashSet<String>  ulk){
        String s1="Germany";
        String s2="USA";

        if (ulk.contains(s1)){

            ulk.remove(s1);
        }
        if (ulk.contains(s2)){
            ulk.remove(s2);
            return;
        }








    }
}
