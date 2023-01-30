package Gun39._04_OOP_Soru;

import Gun34._04_Protected.Paket2.P2Kedi;

public class Soru {


    class  C{
        public C(){
            System.out.println("c");
        }

    }
    class B extends C{
        public B(){
            System.out.println("B");
        }
    }
    class  A extends B{
        public A(){
            System.out.println("A");
        }
    }

    public static void main(String[] args) {

    }
}
