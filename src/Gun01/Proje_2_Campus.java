package Gun01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Proje_2_Campus {
    public static void main(String[] args) {


        // Scanner Class tanimlayin...
        Scanner scan = new Scanner(System.in);

        // Banka Islemleri Listesi tanimlayin..."Para_Yatir", "Para_Cek", "Transfer", "Hesap_Ac"...
        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));

        // Banka musterileri kullanici adi listesi tanimlayin..."User1", "User2", "User3"...
        List<String> users = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));

        // Banka musterileri sifreleri listesi tanimlayin..."password1", "password2", "password3"...
        List<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));

        // Banka musterilerine ait banka hesap numaralari listesi tanimlayin.."11122233", "222333444", "333444555"
        List<String> accountNumbers = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));

        // Banka musterilerine ait banka hesaplarinda bulunan para miktarlarini tanimlayin..
        List<Integer> currentFunds = new ArrayList<>(Arrays.asList(200, 1000, 5000));

        while (true){
            System.out.println("Please enter your username: ");
            String username = scan.nextLine();
            System.out.println("Please enter your password: ");
            String password = scan.nextLine();

            if (confirmUsernameAndPassword(users, passwords, username, password)){
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

        // Actions starts here
        while (true){
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i)+ " - " + (i+1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice){

                case 1:{
                    System.out.println("Bu bankamatik gecici olarak para yatirma islemine kapalidir...Daha sonra tekrar deneyin...");
                    break;
                }

                case 2: {

                    while (true){
                        System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        for (int i = 0; i < accountNumbers.size(); i++) {
                            System.out.println(accountNumbers.get(i));
                        }
                        String chosenAccount = scan.next();
                        if (confirmAccountNumber(accountNumbers, chosenAccount)) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Lutfen para miktarini giriniz...: ");
                        int amountToWithdraw = scan.nextInt();
                        if (!withdraw(currentFunds, amountToWithdraw, accountNumbers.indexOf(chosenAccount))){
                            break;
                        }
                    }
                    break;
                }

                case 3:{
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                    break;
                }

                case 4: System.exit(1);

                default:{
                    System.out.println("Basarili bir secim yapmadiniz...");
                }

            }
        }
    }

    private static boolean withdraw(List<Integer> funds, int amountToWithdraw, int index ) {

        if (funds.get(index) < amountToWithdraw){
            System.out.println("Hesabinizda yeterli bakiye bulunmamaktadir...");
            return true;
        }
        funds.set(index, funds.get(index) - amountToWithdraw);
        System.out.println("Lutfen paranizi aliniz, hesabinizda toplam "+funds.get(index)+" euro kalmistir...");
        return false;
    }

    public static boolean confirmAccountNumber(List<String> accounts, String chosenAccount){

        for (String account : accounts) {
            if (account.equals(chosenAccount)) return false;
        }
        return true;
    }

    private static boolean confirmUsernameAndPassword(List<String> users, List<String> passwords, String username, String password) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equalsIgnoreCase(username) && passwords.get(i).equals(password)){
                return true;
            }
        }
        return false;
    }
}








