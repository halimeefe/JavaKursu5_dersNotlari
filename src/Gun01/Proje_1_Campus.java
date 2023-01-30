package Gun01;

import java.util.Scanner;

public class Proje_1_Campus {
    public static void main(String[] args) {


        // Scanner class tanimlayin...
        Scanner scan = new Scanner(System.in);

        // Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...
        System.out.println("Merhaba, lutfen isminizi giriniz...:");
        String firstName = scan.nextLine();
        String firstLetter = ""+firstName.charAt(0);
        String remainingName = firstName.substring(1);
        firstName = firstLetter.toUpperCase() + remainingName.toLowerCase();

        // Kullanicinin girdigi ismi ekrana yazdirarak, hosgeldin, soyismini girer misin? diyelim...
        System.out.println(firstName + " hosgeldin, soyismini girer misiniz?");
        String lastName = scan.nextLine();
        String firstLetter2 = ""+lastName.charAt(0);
        String remainingName2 = lastName.substring(1);
        lastName = firstLetter2.toUpperCase() + remainingName2.toLowerCase();

        String userInput = "";
        while(!userInput.equalsIgnoreCase("y")){
            // Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...
            System.out.println(firstName + " " + lastName + " isminiz dogru ise devam etmek icin 'Y' tusa basiniz...");
            userInput = scan.nextLine();

            // Eger kullanici 'y' den baska bir tusa basmissa uyari mesaji gosterelim...
            if (!userInput.equalsIgnoreCase("y")){
                System.out.println("Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin...");
            }
        }
        System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");

        System.out.println(" Lutfen kullanici adnizi belirleyin...:");
        String username = scan.nextLine();

        System.out.println(" Lutfen sifrenizi belirleyiniz...:");
        String password = scan.nextLine();

        System.out.println(" Sifrenizi tekrar giriniz...:");
        String password2 = scan.nextLine();

        if (!password.equalsIgnoreCase(password2)){
            System.out.println("Yanlis veya hatali bir sifre girdiniz, lutfen tekrar deneyin...");
        } else {
            System.out.println("Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz...");
        }
    }


    }

