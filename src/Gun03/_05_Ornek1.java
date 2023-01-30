package Gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {

        // iki kenarı tanımlı olarak verilen bir
        // dikdortgenin çevresini ve alanını bulunuz
        // çarpma: * kullanılıyor , x ise harf olarak kullanılıyor
        // bir kenarı a ise , diger kenarı b ise ,cevre=a+a+b+b , alan=a+b


        int kisaKenar = 5;
        int uzunKenar = 8;
        int cevre= kisaKenar + uzunKenar + kisaKenar +uzunKenar;
        int alan= kisaKenar * uzunKenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
