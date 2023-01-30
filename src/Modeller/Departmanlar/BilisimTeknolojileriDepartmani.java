package Modeller.Departmanlar;

import Veritabani.Departmanlar;

public class BilisimTeknolojileriDepartmani implements Departman{

    final String departmanKodu="BTD";

//Zam oranını belirlemeyi unutmayalım
    final int zamOrani= 35;





    @Override
    public int getZamOrani() {

        return this.zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}



