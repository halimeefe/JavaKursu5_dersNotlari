package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {



        int[][]tablo={{3,4,55},{234,22,33}}; // 2 satır 3 sutun

        System.out.println("satır uzunluğu:"+tablo.length);//2//satır sayısı
        System.out.println("0.satırın uzunluğu:"+tablo[0].length);// 0. satırın 3 elemanlı  sutun uzunluğu
        System.out.println("1. satırın uzunuluğu:"+tablo[1].length);// 1. satırın 3 elemanlı sutun uzunluğu

        for (int i = 0; i < tablo.length; i++) {// satır sayısı

            //ilgili satırdaki sutun uzunluğu
            for (int j = 0; j < tablo[i].length; j++) {// 0.satırın sutun elemanlarını verir
                System.out.print(tablo[i][j]+"\t"); // yan yana dizileri yazması için slaç t koyarız
            }
            System.out.println();
        }



    }
}
