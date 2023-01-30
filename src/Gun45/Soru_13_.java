package Gun45;

public class Soru_13_ {
    public static void main(String[] args) {


        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");// arr nin elemanlarını sıralar

            if (arr[i].equals("D")) { //  A B C D YE GELİR D EN SONDA OLDUĞU İÇİN HEPSİ YAZILIR
                System.out.println("work done");// sonra work done yazdırır
                break;//break olduğu için kırılır ve yukarıdaki  döngüye devam etmez
            }
            continue;// zaten buraya inmez bile


        }
    }
}
