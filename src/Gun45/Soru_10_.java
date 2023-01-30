package Gun45;

public class Soru_10_ {
    public static void main(String[] args) {



        String names[] ={"Thomas","Peter","Joseph"};
        String pwd []=new String[3];
        int idx=0;

        try {
            for (String n: names){ // for tryın üzerinde olsaydı cevap /omas/invalid name /sph olurdu
                pwd[idx]=n.substring(2,6);// 2 dahi 6 hariç
                System.out.println(pwd[idx]);//omas **burda sout ile çıktı verdi sonra artırıp ikini kelimeye geçti
                idx++; // sonra 1 artırarak ikinci stringe geçer
            }
        }catch (Exception e){
            System.out.println("Invalid name");
        }
        }

}
