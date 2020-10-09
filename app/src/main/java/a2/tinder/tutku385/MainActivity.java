package a2.tinder.tutku385;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.graphics.drawable.Drawable.createFromStream;

public class MainActivity extends AppCompatActivity {
    private ImageButton likeButton;
    private ImageButton dislikeButton;
    private ImageButton superLikeButton;
    private ImageButton refreshButton;
    private ImageButton lightningButton;
    private ImageView userImage;
    private TextView textName;
    private TextView textOccupation;
    private ArrayList<Users> userList;
    private Utilities utilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defineView();
        utilities=new Utilities();
        userList = utilities.getUserList();
        try {
            displayUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    View.OnClickListener likeListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                displayUser();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };
    View.OnClickListener dislikeListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                displayUser();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

    View.OnClickListener refreshListener= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "This is not implemented",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    };

    View.OnClickListener superLikeListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "This is not implemented",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    };

    View.OnClickListener lightningListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "This is not implemented",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    };

    public void displayUser() throws IOException {
        int number=utilities.randomUser();
        String[] path = userList.get(number).getUserImage().split("\\.");
        int imageID=getResources().getIdentifier(path[0],"drawable",getPackageName());
        userImage.setImageResource(imageID);
        //
        //Log.d("hi", Arrays.toString(splitPath));
        //Log.d("hi", path);
        //
//        String name=userList.get(number).getUserImage();
//        userImage.setBackgroundResource(R.drawable.n);


        textName.setText(userList.get(number).getUserName());
        textOccupation.setText(String.format("%s, %s", userList.get(number).getUserOccupation(),
                userList.get(number).getUserAge()));
    }

    public void defineView(){
        textName=(TextView) findViewById(R.id.textName);
        textOccupation=(TextView) findViewById(R.id.textOccupation);
        userImage=findViewById(R.id.userImage);
        likeButton=findViewById(R.id.likeButton);
        likeButton.setOnClickListener(likeListener);
        dislikeButton=findViewById(R.id.dislikeButton);
        dislikeButton.setOnClickListener(dislikeListener);
        refreshButton=findViewById(R.id.refreshButton);
        refreshButton.setOnClickListener(refreshListener);
        superLikeButton=findViewById(R.id.superLikeButton);
        superLikeButton.setOnClickListener(superLikeListener);
        lightningButton=findViewById(R.id.lightningButton);
        lightningButton.setOnClickListener(lightningListener);
    }

}