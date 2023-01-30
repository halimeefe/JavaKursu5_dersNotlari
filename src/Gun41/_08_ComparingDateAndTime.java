package Gun41;

import java.time.LocalDate;


public class _08_ComparingDateAndTime {
    public static void main(String[] args) {


        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);


        boolean sonraMi = bugun.isAfter(dun);// bugün dünden sonra mı
        System.out.println("sonramı:" + sonraMi);

        boolean onceMi = bugun.isBefore(dun);//bugün dünden önce mi
        System.out.println("öncemi:" + onceMi);

        boolean esitMi = bugun.isEqual(dun);//bugün düne eşit mi
        System.out.println("eşitmi:" + esitMi);

        boolean artikYilmi = bugun.isLeapYear();//bugün artık yıl mı
        System.out.println("artık yıl mı:" + artikYilmi);

    }
}
