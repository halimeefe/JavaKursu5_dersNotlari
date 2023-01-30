package Gun39._05_OOP_Soru;










import Utility.MyFunction;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static  void main(String[] args) {




        Scanner okuStr = new Scanner(System.in);

        ArrayList<IFood>siparisler=new ArrayList<>();





        int  secim;

        do {
            menu();
            secim = okuStr.nextInt();
            switch (secim){


            case 1:
                    AdanaKebap ak=new AdanaKebap();
                    siparisler.add(ak);

                    break;
                case 2:
                    Lahmacun lh=new Lahmacun();
                    siparisler.add(lh);

                    break;
                case 3:
                    Borsh br=new Borsh();
                    siparisler.add(br);

                    break;
                case 4:
                    Palow pl=new Palow();
                    siparisler.add(pl);

                    break;
            }

        } while (secim<5);

        System.out.println("alınan siparişler");
        for (IFood f:siparisler){// foreach le siparişleri araylistten f ye topladık
            System.out.println(f.getClass().getSimpleName());//alınan siparişleri aray listeden
            // f ye çağırdık ve konsolda yazdırıdık
        }
        System.out.println( "siparişleriniz hazırlanıyor...\n");// siparişleriniz hazırlanıyor yazdık
        // ve aşağıdaki metodu technokitchen dan çağırdık

        MyFunction.Bekle(2);// BEKLEME FONKSİYONUMUZU ÇAĞIRDIK 2 İNT SN OLARAK

        double toplam=0;
        for (IFood f:siparisler){
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();  // siparişleri hazırlatıp en sona ücret yazdırdık
        }
        System.out.println("toplam ücret:"+toplam);

    }
    public static void menu(){
        System.out.println("******MENU*********");
        System.out.println("1-ADANA KEBAP");
        System.out.println("2-LAHMACUN");
        System.out.println("3-BORSH");
        System.out.println("4-PALOW");
        System.out.println("5-TAMAM");
        System.out.println("LÜTFEN SEÇİM YAPINIZ...");
    }




}


