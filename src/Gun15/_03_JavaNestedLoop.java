package Gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {



        // aşağıdaki görüntüyü veren programı yazdırınız.
        //*
        //**
        //***
        //****
        //*****


        for (int satir =0; satir<= 5; satir++) {//   j satir anlamında satır 1,2,3,4,5

            for (int yildiz = 0; yildiz < satir; yildiz++)// her bir satırda kaç yıldız yazılacağını bu kısım belirtiyor
                System.out.print("*");


                System.out.println();// satır yazma işi bitince bi alt satıra  geçiriyor

            }


        }
    }


