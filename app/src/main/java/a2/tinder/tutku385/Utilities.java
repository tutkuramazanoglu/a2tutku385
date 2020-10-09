package a2.tinder.tutku385;

import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class Utilities {
    ArrayList<Users> userList=new ArrayList<>();

    public ArrayList<Users> getUserList() {
        this.userList.add(new Users("Barbara", 24, "Designer", "barbara.jpg"));
        this.userList.add(new Users("James",25,"Nursing Student","james.jpg"));
        this.userList.add(new Users("Linda",32,"Engineer","linda.jpg"));
        this.userList.add(new Users("Micheal",23,"Sales Account Manager","michael.jpg"));
        this.userList.add(new Users("Robert",39,"Photographer","robert.jpg"));
        this.userList.add(new Users("Patricia",26,"Freelancer","patricia.jpg"));
        return userList;
    }

    public int randomUser(){
        Random r = new Random();
        int number=getUserList().size();
        int selectedValue = r.nextInt(number) ;
        return selectedValue;
    }



}
