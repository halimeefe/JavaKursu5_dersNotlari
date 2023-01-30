package Gun07;

public class Soru5 {
    public static void main(String[] args) {

        //**apple** olan bir String oluşturun.
        //String'in apple 'a eşit olup olmadığını doğrulayın.
        //Büyük harf veya küçük harf önemli değildir.


        String k1="apple";
        String k2="APPLE";
        boolean esitMi=k1.equalsIgnoreCase(k2);
        System.out.println("apple APPLE'a eşit mi?:"+ esitMi);





    }
}
