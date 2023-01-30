package OOP_Odev._03_Odev;

import javax.smartcardio.Card;
import java.util.ArrayList;

public abstract class Phone {

    public static ArrayList<String> card=new ArrayList<>();



    public static int getSum(ArrayList<String>list){
        int total=0;
        for (String str:list){
            int pay;
            pay=Integer.parseInt(str.replaceAll("\\$",""));
            total+=pay;
        }
          return total;
    }

  public abstract void options(String capasity,String screenSize) ;



}
