package Gun37._01_Soru;

import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.ArrayList;
import java.util.List;

public class VehicleMain {
    public static void main(String[] args) {


        ArrayList<Vehicle> arabalar = new ArrayList<>();

        TeslaCar tesla=new TeslaCar("MODEL 5",310);
        Toyota pirus=new Toyota("SEDAN",1200);
        Bus bus=new Bus("ıVECO",7000);

        arabalar.add(tesla);
        arabalar.add(pirus);
        arabalar.add(bus);

        for (Vehicle v:arabalar){// ARRAYLİSTLERDE FOREACH İLE ÖZELLİKLERİNİ SIRALARIZ
            System.out.println("-----------------------------");
            System.out.println(v.getClass().getSimpleName());// CLASIN İSMİNİ ALABİLİYORUZ  YANİ   **TESLA CAR**TOYOTA**BUS**
                                                            // SOUTTTA ARABALARIN İSİMLERİNİ YAZDIRIR
            System.out.println("------------------------------");

            System.out.println("v.getmodel:"+v.getModel());
            System.out.println("v.getengine:"+v.getEngine());

            if (v instanceof TeslaCar){  // BURADA ARABALAR VEHİCLE DAN ORTAK EXTEND OLDUĞU İÇİN
                                         // ELSE İF LERLE İNSTEANCEOF YAZARAK METODLARI GÖRMEYİ SAĞLARIZ
                System.out.println(((TeslaCar)v).drive());
                System.out.println(((TeslaCar)v).changeBatery());

            }
            else
                if (v instanceof Toyota){  // YANİ TİP DÖNÜŞÜMÜ YAPARIZ
                    System.out.println( ((Toyota)v).drive());
                    System.out.println(((Toyota)v).changeBatery());

                } else if (v instanceof Bus) {
                    System.out.println( ((Bus)v).drive());
                    System.out.println( ((Bus)v).changeDeisel());

                }


        }







    }




}
