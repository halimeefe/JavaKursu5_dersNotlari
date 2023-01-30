package Gun26._02_Ornek;

public class Person {

    String name;
    String surName;
    int age;

    public void BilgiYazdir()//metodu class ta hazırlarız static şimdilik yazmıyoruz
    {                       // bilgiler classta olduğu için burada parantezin içini ve altta soutları ayrıntılı yazmıyoruz

        System.out.println("name:" + name);
        System.out.println("surname:" + surName);
        System.out.println("age:" + age);

    }

    public String toString() // burada to string metodu yazarsak bilgileri en kısa şekilde çağırabiliriz
    {
        return name + " " + surName + " " + age;// adı ve  soyadı ve yaşı bize döndürür

    }

    public void getBirthYear()// personun doğum yılını bu şekilde alırız
    {
        System.out.println("doğum yılınız:" + (2022 - age));//bu yıldan yaşını çıkarırız


    }

    public String getBirthYear2()
    {
        return "doğum yılınız:" + (2022 - age);// doğum yılını 2. yöntem olarak bu şekilde de return le çağırabiliriz

    }



     public void getInitials()// personun adının ve soyadının ilk harflerini alırız aralarına nokta koyarak
     {
         System.out.println(name.toUpperCase().charAt(0)+"."+// charat 0 adının ilk harfini verir
         surName.toUpperCase().charAt(0)+".");// soyadının ilk harfini verir
     }
}
