package JavaSoruÇözümleri;

public class ArraysStringSayiToplama {
    public static void main(String[] args) {


        //Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"

        //$ işaretlerini kaldırın ve sayıları toplayın.

        //Sayıların toplamını yazdırın.
        String str="$12 $23 $10 $2 $5 $2";
        String[]arr=str.split(" ");//   str deki boşluklardan itibaren parçalar
        int total=0;
        for (int i = 0; i < arr.length; i++) {// diziye atadık burda sıralarız
            arr[i]=arr[i].replace("$","");    // dizinin her elemanının yanındaki dolar işretini replace ile sileriz
            total+=Integer.parseInt(arr[i]); // dizinin her elemanı string olduğu için parse ınt yaparız ve toplarız

        }
        System.out.println("toplam:"+total);





    }
}
