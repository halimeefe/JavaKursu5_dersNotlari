package JavaSoruÇözümleri;

public class Array_TV_KanaliRandomSecme {
    public static void main(String[] args) {

        //5 tv kanalın ismini bir diziye doldurunuz
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.

        String[]kanallar={"TRT","KANAL D","ATV","FOX","HABERTURK"};// TV KANALLARINI BİR DİZİYE ATADIK

        int rnd=(int)(Math.random()* kanallar.length);  //RND ADINDA RASTGELE RANDOMLA SEÇİLEN DEĞİŞKEN İSMİ TANIMLADIK
        System.out.println("seçilen tv kanalı:"+kanallar[rnd]);// RANDOM SEÇİLEN VE RND YE ATANAN KANALIN İSMİNİ YAZDIRDIK

        }
}

