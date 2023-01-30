package Modeller.Departmanlar;

public class YonetimDepartmani implements Departman{

    final String departmanKodu="YD";

    final int zamOrani=50;




    @Override
    public int getZamOrani() {
        return this.zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}
