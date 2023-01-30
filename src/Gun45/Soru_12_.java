package Gun45;

public class Soru_12_ {
    public static void main(String[] args) {




        String[] arr={"A","B","C","D"};

        for ( int i=0; i<arr.length ;i++){
            System.out.println(arr[i]+" ");// arr nin elemanlarını sıralar ve if e iner

            if (arr[i].equals("C")){ // a c ye eşit değil pass geçer ve diğer harflere geçmez
                continue;// a dan sonra pass geçer
            }
            System.out.println("work done");// sonra work done yazdırır
            break;//break olduğu için kırılır ve yukarıdaki  döngüye devam etmez
        }// cevap A VE WORK DONE

    }
}
