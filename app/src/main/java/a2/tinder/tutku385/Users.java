package a2.tinder.tutku385;

public class Users {
    private String userName;
    private String userImage;
    private String userOccupation;
    private int userAge;
    public Users(String name,int age,String occupation,String image) {
        userName=name;
        userAge=age;
        userOccupation=occupation;
        userImage=image;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public String getUserOccupation() {
        return userOccupation;
    }

    public int getUserAge() {
        return userAge;
    }

}
