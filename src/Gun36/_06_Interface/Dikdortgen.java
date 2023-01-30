package Gun36._06_Interface;

public class Dikdortgen implements IHesapla{


    @Override
    public int cevre(int kisaKenar, int uzunKenar)
    {
        return (kisaKenar+uzunKenar)*2;
    }

    @Override
    public int alan(int kisaKenar, int uzunKenar) {
        return kisaKenar*uzunKenar;
    }

    }



