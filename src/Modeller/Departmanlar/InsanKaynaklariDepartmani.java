package Modeller.Departmanlar;

import Veritabani.Departmanlar;

public class InsanKaynaklariDepartmani implements Departman{


    final String departmanKodu="IKD";
    final int zamOrani=30;




    @Override
    public int getZamOrani() {



        return this.zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}
