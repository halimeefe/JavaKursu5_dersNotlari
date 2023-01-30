package Gun30._01_StaticVariables.Ornek_2;

public class Student {
    int id;
    String fullName;

    static int sayac=1;
    //STATİC OLMADAN ÖNCE DEĞERİNİ KORUYODU
    //VE HER NEW ELEMANA O ID VERİYODU
    //ARTIK STATİC YAPTIK SAYACI VE SAYAC
    //HER NEW ELEMANDA KENDİNİ 1 ARTIRDI

    public Student(int id,String fullName){
        this.id=id;
        this.fullName=fullName;
        // maindeki ilk 3 satır için gerekli,
        //static değişkenden sonra gerek kalmadı

    }
    public Student(String fullName){
        this.id=sayac++;// önce var olan değer veriliyor,sonra ARTIYOR
        this.fullName=fullName;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
