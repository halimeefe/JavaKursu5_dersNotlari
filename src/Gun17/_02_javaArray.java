package Gun17;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Scanner;

public class _02_javaArray {
    public static void main(String[] args) {

        // kullanıcın gireceği bir cümlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        //Bu gün hava çok güzel->5



        Scanner oku=new Scanner(System.in);
        System.out.print("cumle  giriniz:");
        String cumle=oku.nextLine();

        int boslukSayisi=0;
        for (int i=0;   i<cumle.length(); i++){  //  i  boşlukları temsil ediyor
            if (cumle.charAt(i) ==' ')
            boslukSayisi++;

        }
        System.out.println("kelime sayısı="+(boslukSayisi+1));






    }
}
