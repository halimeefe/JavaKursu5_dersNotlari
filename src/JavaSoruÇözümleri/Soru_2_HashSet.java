package JavaSoruÇözümleri;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Soru_2_HashSet {
    public static void main(String[] args) {
//
// changeSet() isminde bir method oluşturun.
//
//Parametre olarak bir String HashSet   ve  iki String
//
//return hashset olmalı
//
// Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//
//**ÖRNEK:**
//
// hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//
//  String 1 = **banana**
//
// String 2 = **peach**
//
////**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

        TreeSet<String>fruit=new TreeSet<>();



        fruit.add("banana");
        fruit.add("strawberry");
        fruit.add("kiwi");
        fruit.add("pineaple");





    }public static void changeSet(HashSet<String>fruit)
    {

        TreeSet<String> my=new TreeSet<>();
       my.add("banana");
       my.add("peach");

        if (fruit.contains(0))


        System.out.println(fruit);

    }

        }

















