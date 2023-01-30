package Gun31._02_Enum;

public class Soru {
    enum Role{ ADMIN,MUDUR,SATIS,PERSONEL}
    enum Statu{ AKTIF,PASIF}


    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

    //rol ve statu olarak 2 enum
    //sonrada user tanımla
    public static void main(String[] args) {

        User user1=new User("İsmet",Role.ADMIN,Statu.AKTIF);//
        User user2=new User("mehmet",Role.MUDUR,Statu.PASIF);
        User user3=new User("Ayşe",Role.SATIS,Statu.AKTIF);

        userSil(user1);
        userSil(user2);
        userSil(user3);

        System.out.println("user1:"+user1);
        System.out.println("user2:"+user2);
        System.out.println("user3:"+user3);


    }
    public static void userSil(User user){

        if (user.role ==Role.ADMIN)
        {
            System.out.println(user.userName+"ADMİN SİLİNEMEZ");
        }
    }
}
