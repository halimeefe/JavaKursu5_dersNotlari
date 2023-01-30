package JavaSoruÇözümleri;

public class NestedLoop {
    public static void main(String[] args) {



        // uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz
        // bir kod yazınız.
        int j=5; //alt alta satır
        int i=7; // yan yana uzunluk


        for (j=0;  j<5; j++){
            for (i=0; i<7; i++)
                System.out.print("#");
            System.out.println();
        }

    }
}
