package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {

        // Kullanıcının girdiği gün numarasına karşılık gelen günün adını yazınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Gün no:");
        int gunNo = oku.nextInt();


        switch (gunNo) {
            case 1:// *************************CASE 1:EĞER 1 İSE DEMEKTİR "İF" YERİNE "CASE" KULLANILIR
                System.out.println("pazartesi");
                break;// switchden çık demek break//***BREAK EĞER PAZARTESİ İSE DÖNGÜDEN ÇIK DEVAM ETME DEMEK
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("PERŞEMBE");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default://***************************DEFAULT : BÜTÜN BUNLARIN DIŞINDA BİR SAYI GİRİLİRSE HATA VER DEMEK
                System.out.println("hatalı numara");// case dekilerin dışında ise
        }

                // if lerde tek değer olması durumunda


        }
    }
