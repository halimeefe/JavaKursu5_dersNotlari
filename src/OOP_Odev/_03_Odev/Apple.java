package OOP_Odev._03_Odev;

public class Apple extends Phone{


    @Override
    public void options(String capasity, String screenSize) {
        if (capasity.contains("128")&& screenSize.contains("5.5")){
            card.add("750$");

        } else if (capasity.contains("128")&& screenSize.contains("6.5")) {
            card.add("850$");

        } else if (capasity.contains("256")&& screenSize.contains("5.5")) {
            card.add("950$");
        } else if (capasity.contains("256")&& screenSize.contains("6.5")) {
            card.add("1200$");
        }
    }
}


