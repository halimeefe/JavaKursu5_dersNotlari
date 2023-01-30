package Veritabani;

import Modeller.Calısanlar.Calisan;

import java.util.ArrayList;

public class Calisanlar {


    private static ArrayList<Calisan> calisanList = new ArrayList<>();  // VERİTABANI

    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }

    public static void addCalisan(Calisan calisan) {
        calisanList.add(calisan);


    }

    public static void deleteCalisanWithId(String calisanId) {
        for (int i = 0; i < calisanList.size(); i++) {
            if (calisanId.equals(calisanList.get(i).getCalisanId())) {
                calisanList.remove(calisanList.get(i));
                return;
            }
        }

    }

    public static void printDepartmandakiCalisanlar(String departmanKodu) { // BTD Yİ İSTEYİNCE BİLŞİMDEKİLER LİSTELENECEK

        for (int i = 0; i < calisanList.size(); i++) {
            if (departmanKodu.equals(calisanList.get(i).getDepartman().getDepartmanKodu())) {
                System.out.println("Calisan ID = " + calisanList.get(i).getCalisanId() + "Ad Soyad = " + calisanList.get(i).getAdSoyad() +
                        "Maaş = " + calisanList.get(i).getMaas() + "Departmanı = " + calisanList.get(i).getDepartman());


            }

        }
    }

        // Calisanlari konsola yazdirmak için
        public static void printCalisanlar() {
            for (int i = 0; i < calisanList.size(); i++) {
                System.out.println("Calisan ID = " + calisanList.get(i).getCalisanId() + "Ad Soyad = " + calisanList.get(i).getAdSoyad() +
                        "Maaş = " + calisanList.get(i).getMaas() + "Departmanı = " + calisanList.get(i).getDepartman());


            }
        }
    }

