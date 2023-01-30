package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {



        int[]dizi=new int[10];//boş default 0 olan
        int[]dizi2={2,3,4,5,6,7,56,67,77};

        int[][] tablo=new int [2][3];//2 satır row,3 sütun column,
                                      // boş default değer 0 ve 2*3 kadar 6 adet sayı
        int [][]tablo2={
                {2,3,4,},// 0.satır
                {34,45,5}  //1. satır
        };
        for (int i = 0; i < 2; i++) {// ****tek forla yazdırsaydık bu şekilde olurdu//** i satırı temsil ediyor
            System.out.print(tablo2[i][0]+" ");;//*** her bir satırın 0.elemanı
            System.out.print(tablo2[i][1]+" ");// ***her bir satırın 1.elemanı
            System.out.print(tablo2[i][2]+" ");//*** her bir satırın 2.elemanı

            System.out.println();//***

        }
        // 2 for lu yöntem kesin ve hatasız**********************
        for (int satir = 0; satir < 2; satir++) {//***i satırı temsil eder

            for (int sutun = 0; sutun < 3; sutun++) {// her bir satırın sütunlarını  yazdıran for//**j sutunu temsil eder
                System.out.print(tablo2[satir][sutun]+" ");
            }
            System.out.println();// her satırın yazma işleminden sonra satır atlanıyor
        }


    }
}
