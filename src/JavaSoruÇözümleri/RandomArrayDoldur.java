package JavaSoruÇözümleri;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

public class RandomArrayDoldur {
    public static void main(String[] args) {


        //SORU:4*4 BİR İNT ARAY TANIMLAYIN VE RANDOM DOLDURUP EKRANA YAZDIRIN

        int[][]arr=new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(int)(Math.random()*11);

            }

        }
        System.out.println(Arrays.deepToString(arr));


    }
}
