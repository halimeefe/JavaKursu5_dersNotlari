package Gun41;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _04_LocalDateTime {
    public static void main(String[] args) {




        //LOCALDATETİME HEM SAAT HEM DE TARİH  BİLGİSİNİ VERİR

        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt:"+dt);

        System.out.println("dt.getyear:"+dt.getYear());

        System.out.println("dt.getmonth:"+dt.getMonth());

        System.out.println("dt.getmontvalue:"+dt.getMonthValue());

        System.out.println("dt.getdayofyear:"+dt.getDayOfYear());

        System.out.println("dt.getdayofmont:"+dt.getDayOfMonth());

        System.out.println("dt.getdayofweek:"+dt.getDayOfWeek());

        System.out.println("getdayofweek.getvalue:"+dt.getDayOfWeek().getValue());

        System.out.println("dt.gethour:"+dt.getHour());

        System.out.println("dt.getmınute:"+dt.getMinute());

        System.out.println("dt.getsecond:"+dt.getSecond());

        System.out.println("dt.getnano:"+dt.getNano());

        System.out.println("ISODATETİME:"+ dt.format(DateTimeFormatter.ISO_DATE_TIME));

        System.out.println("short:"+dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

        System.out.println("medıum:"+dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        // ÖZEL FORMATTA İSTEDİĞİMİZ YAZDIRMA


    }
}
