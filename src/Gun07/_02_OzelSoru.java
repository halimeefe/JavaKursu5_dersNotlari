package Gun07;

import java.util.Scanner;

public class _02_OzelSoru {
    public static void main(String[] args) {


        //* Girilen bir kelimenin Blank olup olmadığına bakınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Kelime giriniz:");
        String kelime=oku.next();
        boolean bosmu= kelime.isEmpty();

        System.out.println("boşmu="+bosmu);





    }
}
