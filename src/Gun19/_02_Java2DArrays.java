package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {


        int[][]tablo ={{4,55},{45,6,77},{4,2,999,45,56,66},{42,12,9},{4}};

        System.out.println("satır miktarı:"+tablo.length);
        System.out.println("0.Satırdaki sutun sayısı:"+tablo[0].length);//0. satırın elemanları=2
        System.out.println("1.satırdaki sutun sayısı:"+tablo[1].length);// 1. satırın elemanları=3
        System.out.println("2.satırdaki sutun sayısı:"+tablo[2].length);//2. satırın elemanları=6
        System.out.println("3. satırdaki sutun sayısı:"+tablo[3].length);//3. satırın elemanları=3
        System.out.println("4.satırdaki sutun sayısı:"+tablo[4].length);//4. satırın elemanları=1

        // yazdırma bölümü alttaki gibi olmalı
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");// bütün elemanları yanyana yazdırır

            }
            System.out.println();// yan yana yazdıktan sonra bir alt satıra geçirir


        }





    }

}
