package Veritabani;

import Modeller.Departmanlar.BilisimTeknolojileriDepartmani;
import Modeller.Departmanlar.Departman;
import Modeller.Departmanlar.InsanKaynaklariDepartmani;
import Modeller.Departmanlar.YonetimDepartmani;

import java.util.ArrayList;
import java.util.Arrays;

public class Departmanlar {

    static private final Departman BILISIM_TEKNOLOJILERI_DEPARTMANI=new BilisimTeknolojileriDepartmani();

    static  private final Departman YONETIM_DEPARTMANI=new YonetimDepartmani();

    static  private final Departman INSAN_KAYNAKLARI_DEPARTMAI=new InsanKaynaklariDepartmani();

    static  private ArrayList<Departman> DepartmanList =new ArrayList<>(Arrays.asList(BILISIM_TEKNOLOJILERI_DEPARTMANI,YONETIM_DEPARTMANI,INSAN_KAYNAKLARI_DEPARTMAI));


    public static ArrayList<Departman> getDepartmanList() {
        return DepartmanList;
}
}








