package Mortgage;

public class Users {

  private   String username;
  private   String whichConditon;
  private   String houseType;
  private   int roomCount;
  private int downPayment;
  private   int longTerm;
  private StatesTax StatesTax;


    public Users(String username, String whichConditon, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        this.username = username;
        this.whichConditon = whichConditon;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
       this.longTerm = longTerm;
        this.StatesTax = statesTax;
    }

    public String getUsername() {
        return username;
    }

    public String getWhichConditon() {
        return whichConditon;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public Mortgage.StatesTax getStatesTax() {
        return StatesTax;
    }
}


