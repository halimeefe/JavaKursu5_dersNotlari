package Gun45;

public class Soru_11_ {
    public static void main(String[] args) {


        String names[]={"Thomas","peter","joseph"};
        String pwd []=new String[3];
        int idx=0;

        try {
            for (String n : names){
                pwd[idx]= n.substring(2,6);// omas / null /null
                idx++;

            }
        }catch (Exception e)
        {
            System.out.println("ınvalid name");
        }
        for (String p: pwd)
            System.out.println(p); // önce ınvalid name yazılır ,sonrada omas, null, null




    }
}
