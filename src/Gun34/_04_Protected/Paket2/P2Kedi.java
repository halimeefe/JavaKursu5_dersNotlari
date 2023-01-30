package Gun34._04_Protected.Paket2;


import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public  P2Kedi(String ad,String cinsi){
        this.ad=ad;
        this.cinsi=cinsi;// protected defaulttan farklı olarak
        // extend edildiğinde diğer paketlerden de erişilebilir
        //bu bize kalmış bir durumdur
        //izin verirsek erişilebilir
        //izin vermezsek private yaparız protected kullanmayız



    }


}
