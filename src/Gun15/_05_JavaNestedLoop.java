package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {



        // aşağıdaki görüntüyü veren  programı yazınız
        //*
        //**
        //***
        //****
        //*****
        //*****
        //****
        //***
        //**
        //*


        for (int j = 1; j <= 5; j++) {  //satır:1,2,3,4,5
            for (int i = 0; i < j; i++) // satır:5

                System.out.print("*");//*****

            System.out.println();
        }

        for (int satir = 5; satir > 0; satir--) { // 5,4,3,2,1
            for (int h = 0; h<satir; h++) {

                System.out.print("*");
            }


            System.out.println();



        }

    }
}
















