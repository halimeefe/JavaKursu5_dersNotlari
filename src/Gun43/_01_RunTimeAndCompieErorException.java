package Gun43;

public class _01_RunTimeAndCompieErorException {
    public static void main(String[] args) {

        System.out.println("program çalışmaya başladı");
        String kelime="";  //önce noktalı virgül koymadık bu COMPİLE ERROR yani derleme hatası
        char harf=kelime.charAt(3); // bu satırı en son ekledik, bu RUNTİME ERROR
        System.out.println("program bitti");






    }
}
// DAHA ÇALIŞMADAN ÖNCE OLUŞMUŞ EKSİKLERDEN KAYNAKLI HATALARA
//DERLEME ZAMANI YANİ COMPİLE ERROR ,EXCEPTİON DİYORUZ.

//PROGRAM ÇALIŞTIKTAN SONRA ÇALIŞMA ZAMANI İÇERİSİNDEKİ HATALARA
// ÇALIŞMA ZAMANI YANİ RUNTİME ERROR ,EXCEPTION DİYORUZ
