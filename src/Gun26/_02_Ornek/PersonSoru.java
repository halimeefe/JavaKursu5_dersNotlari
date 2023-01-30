package Gun26._02_Ornek;

public class PersonSoru {
    public static void main(String[] args) {





        Person cal1=new Person();// çalışan 1 adında nesne oluşturduk
        cal1.name="Hatice";
        cal1.surName="Demir";
        cal1.age=30;

        Person cal2=new Person(); // çalışan iki adında personel tanımladık
        cal2.name="Ali";
        cal2.surName="veli";
        cal2.age=42;

        System.out.println("cal1:"+cal1);

     //**************************************************
        cal1.getBirthYear();// sout metodun içinde var  yüzden burda yazmayız direk cal1 in dğum yılını çağırırız
        System.out.println(cal2.getBirthYear2());// bunu return le döndürdük metoddan ,o yüzden sutun içinde yazdık
//**************************************************************
        System.out.println();
        //1.yöntem
        System.out.println("cal1 name:"+cal1.name);
        System.out.println("cal1 surname:"+cal1.surName);
        System.out.println("cal1 age:"+cal1.age);

        System.out.println("cal2 name:"+cal2.name);
        System.out.println("cal2 surname:"+cal2.surName);// uzun haliyle cal1 ve cal2 yi soutta yazdırdık
        System.out.println("cal2 age:"+cal2.age);



        System.out.println();

        //2.yöntem normal metod
        BilgiYazdir(cal1); // burası kısa şekilde metodla yazılmış hali
        BilgiYazdir(cal2);// bu metodları class ta hazırlarız

//***************************************************************
        System.out.println();

        //3.yöntem aid olduğu classtan çağırıyoruz
        cal1.BilgiYazdir();// zaten bilgiler classta var parantezi doldurmasakta olur
        cal2.BilgiYazdir();
//**********************************************************************

        System.out.println( "cal1:"+cal1);// clastaki t string metodunu çağırırız ve cal1 in bilgilerini yazdırırız
                             // return olarak döndürür cal1:Hatice demir 30 olarak bilgiyi verir


        cal1.getInitials();// bu metodla personun adının ve soyadının ilk harflerini yazdırırız soutu metodda yazmıştık

        System.out.println();// bunu konsolda yazdırırken aralarına bşluk koymak için yazdım


    }
    public static void BilgiYazdir(Person cal){

        System.out.println("cal2 name:"+cal.name);
        System.out.println("cal2.surname"+cal.surName);
        System.out.println("cal2.age:"+cal.age);


    }

}

