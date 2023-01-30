package JavaSoruÇözümleri;

public class _2_KatliArraydeSonElemanlariTopla {
    public static void main(String[] args) {


        // verilen 2 katlı bir array deki
        // her bir inner array in son elementerinin
        //toplamını yazdıran bir method oluşturun.

        int [][]arr={{5,7},{5,8,9},{0,1}};

        int toplam=0;
        for (int i=0;i<arr.length;i++){
            toplam+=arr[i][(arr[i].length-1)];

        }
        System.out.println("sonuç:"+toplam);
    }





    }

