package Gun26._03_Ornek;

public class Rectangle {

    int wide;
    int leng;



    public void getAlan()// alanını hesaplamak için method yazdık
    {
        System.out.println(wide*leng); //soutla gönderdik kısa kenar *uzun kenar

    }

    public void getCevre()
    {
        System.out.println((wide+leng)*2);
    }// çevre metodu iki kenarı topla 2 ile çarp
}

