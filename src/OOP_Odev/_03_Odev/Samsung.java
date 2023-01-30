package OOP_Odev._03_Odev;

public class Samsung extends Phone{
    @Override
    public void options(String capasity, String screenSize) {
        if (capasity.contains("256")&& screenSize.contains("5.5")){
            card.add("1100$");

        }else if (capasity.contains("256")&& screenSize.contains("5.5")){
            card.add("1100$");
        }else if (capasity.contains("256")&& screenSize.contains("7.5")){
            card.add("1200$");

        } else if (capasity.contains("512")&& screenSize.contains("5.5")) {
            card.add("1300$");

        } else if (capasity.contains("512") && screenSize.contains("7.5")) {

        }

    }
}
