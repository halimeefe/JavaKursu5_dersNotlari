package Gun41;

import javax.jws.soap.SOAPBinding;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZoneDateTime {
    public static void main(String[] args) {

        //BAŞKA ZAMAN BÖLGELERİNİN (TIME ZONE)ZAMAN BİLGİSİNİ ALMA


        ZonedDateTime zdt =ZonedDateTime.now();
        //ŞU ANDA BENİM BULUNDUĞUM DEFAULT ZAMANI VERDİ->İSMET HOCA
        System.out.println("zdt:"+zdt);


        Set <String> zamanBolgeleri= ZoneId.getAvailableZoneIds();

        for (String z:zamanBolgeleri) {
            if (z.toLowerCase().contains("anbul"))// İSTANBUL
                System.out.println("z:" + z);
        }

            ZoneId zoneIdIstanbul = ZoneId.of("Europa/Istanbul");
            ZonedDateTime zoneIstanbul = ZonedDateTime.now(zoneIdIstanbul);
            System.out.println("zoneIstanbul:"+zoneIstanbul);

            ZoneId zoneIdLondon = ZoneId.of("Europa/London");
            ZonedDateTime saatLondon = ZonedDateTime.now(zoneIdLondon);
            System.out.println("saatLondon:"+saatLondon);


        }
        }

