package Gun41;

import Utility.DNMmyFunct;
import Utility.MyFunction;

import javax.jws.soap.SOAPBinding;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {
        //canlı digital saat yapınız

        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");// saat metodumu biz ayarladık

        while (true){

            LocalTime saat=LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunction.Bekle(1);


            }
        }

    // canlı saat yaptık
        // souttan ln yi sildik böylece saat dijital bir
        // şekilde sabit ilerliyor
        //so outun içine \r yazdıkki saat ilerlersin ve öncekini silsin
        // my function bekle kullandık 1 saniye olarak ayarladık





    }











