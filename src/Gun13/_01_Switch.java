package Gun13;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // Girilen  bir ay numarasına göre ayın kaç gün sürdüğünü yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.print("AY NUMARASI:");
        int ayNo=oku.nextInt();

        switch (ayNo){
            case 1:System.out.println(31);break;
            case 2:System.out.println(28);break;
            case 3:System.out.println(31);break;
            case 4:System.out.println(30);break;
            case 5:System.out.println(31);break;
            case 6:System.out.println(30);break;
            case 7:System.out.println(31);break;
            case 8:System.out.println(31);break;
            case 9:System.out.println(30);break;
            case 10:System.out.println(31);break;
            case 11:System.out.println(30);break;
            case 12:System.out.println(31);break;
            default:
                System.out.println("hatalı ay no");


        }








    }




}
