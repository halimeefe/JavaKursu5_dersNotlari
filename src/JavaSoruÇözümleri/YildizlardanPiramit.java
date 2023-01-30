package JavaSoruÇözümleri;

public class YildizlardanPiramit {
    public static void main(String[] args) {


        // yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        // sonuç böyle olmalıdır
        //*
        //**
        //***
        //****
        //*****


        for (int j = 0; j <= 5; j++) {

            for (int i = 0; i < j; i++)
                System.out.print("*");

            System.out.println();
        }

    }
}






