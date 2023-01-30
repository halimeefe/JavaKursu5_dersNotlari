package Gun45;

public class Soru_18_ {
    public static void main(String[] args) {



        int cnt=0;
        String [][]arr= {{"A", "B", "C"}, {"D", "E"}};

        for (int i=0; i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+" ");// ABCDE

                if (arr[i][j].equals("B")){
                 continue;  // etkisi yok çünkü kendisinden sonra gelen kod yok
                }           //NOT:BURADA CONTNIU YERİNE BREAK OLSAYDI ABDE YAZARDI İFİN DÖNGÜSÜ SADECE
                           // KIRILIYOR ,EĞER BREAK İFİN EN DIŞINDA OLSAYDI AB YAZARDI
            
            }continue;//etkisi yok
            // çünkü kendinden sonra gelen kod yok
        }

    }
}
