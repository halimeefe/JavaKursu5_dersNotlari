package Gun31._02_Enum;

public class User {

    String userName;
    Soru.Role role;
    Soru.Statu statu;


    public User(String userName, Soru.Role role, Soru.Statu statu) {
        this.userName = userName;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}



