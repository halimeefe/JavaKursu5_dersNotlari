package Mortgage;

public class HousePrices extends Users {



    public HousePrices(String username, String whichConditon, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        super(username, whichConditon, houseType, roomCount, downPayment, longTerm, statesTax);
    }

    private int price;



        private void PriceTotal(int price){
            this.price=price;



    }

    public  void roomCountToPrice() {

            if (getRoomCount() == 1) {
            price+=20000;

        } else if (getRoomCount() == 2) {
            price+=30000;

        } else if (getRoomCount() == 3) {
            price+=40000;

        } else if (getRoomCount() == 4) {
            price+=50000;

        } else if (getRoomCount() == 5) {
            price+=60000;

        }else if (getRoomCount() == 6){
            price+=70000;
        } else if  (getRoomCount() == 0) {
            price+=10000;

        }
    }
    public void conditionToPrice() {
        if (getWhichConditon().equalsIgnoreCase("new")) {
            price+=50000;

        } else if (getWhichConditon().equalsIgnoreCase("like new")) {
            price=40000;

        } else if (getWhichConditon().equalsIgnoreCase("old")) {
            price=30000;

        } else if (getWhichConditon().equalsIgnoreCase("renew required")) {
            price+=15000;
        }
    }
    public void houseTypeToPrice() {
        if (getHouseType().equalsIgnoreCase("Apartment")) {
            price+=20000;

        } else if (getHouseType().equalsIgnoreCase("condo")) {
            price+=30000;

        } else if (getHouseType().equalsIgnoreCase("house")) {
            price+=40000;
        }
    }
    public void calculateTax() {

    }

    public int getPriceTotal() {

        this.roomCountToPrice();
        this.conditionToPrice();
        this.houseTypeToPrice();


        price = price + ((price * getStatesTax().getTax()) / 100);

        return price;
    }

    public int getPriceEachMonth(){

        int a=price;
        int b =getDownPayment();
        int c = getLongTerm();
        int d=(a-b)/c;

        return d;

    }


}


