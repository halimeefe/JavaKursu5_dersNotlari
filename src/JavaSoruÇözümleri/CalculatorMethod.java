package JavaSoruÇözümleri;

public class CalculatorMethod {
    public static void main(String[] args) {


        //calculator isminde bir method yaziniz parametre olarak iki tane int deger alsin ve 1 tane de string turunde bir parametre
        //  alsin ve string parametreye gore islem yapsin (topla,cikar,carp,bol  gibi)

      System.out.println(calculator(12,4,"bol"));
      System.out.println(calculator(12,4,"topla"));
      System.out.println(calculator(12,4,"cikar"));
      System.out.println(calculator(12,4,"carp"));
     System.out.println(calculator(12,4,"carpg"));







    }public static double calculator(int a,int b,String s)
    {
        switch (s){
            case "bol":return (a/b);
            case "topla":return (a+b);
            case "carp":return (a*b);
            case " cıkar":return (a-b);
        }
        return 0;
    }

}
