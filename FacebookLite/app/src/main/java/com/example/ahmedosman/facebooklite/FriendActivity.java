package com.example.ahmedosman.facebooklite;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.ahmedosman.facebooklite.models.Friends;

public class FriendActivity extends AppCompatActivity {
    Friends[] friends = {
            new Friends("Q", "Very agressive playstyle. Tends to ask for help then ends up getting you killed. " +
            "                               Somehow always escapes after everybody dies. Great player, but very selfish.\n\"I NEED HELP\" "),
            new Friends("Jewels", "A pro hiding behind the skills of a noob. " +
                     "He's comfortable not rushing, but is capable of shredding the entire battlefield. " +
                     "Held back by his camping gene. \n\"They don't know I am here\""),
            new Friends("Artem", "well rounded player. \n\" Lit \" "),
            new Friends("Blessed", "Veteran player who's capable of handling his own. Extremely reliable, but a slow learner. " +
                     "Specialized in long range combat. \n\"I have to leave\""),
            new Friends("Jerry", "Alien like skills and a terrifying claw play style. Known as the silent monster. " +
                     "His skill componsates for his lack of communication. \n\"Unbelievable\" ")
};

    private Button mQ;
    private Button mJewels;
    private Button mArtem;
    private Button mBlessed;
    private Button mJerry;

    public void attachClickListener(Button button, final int n){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendActivity.this, FriendDetailActivity.class);
                intent.putExtra("name", friends[n].name);
                intent.putExtra("bio", friends[n].bio);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_activity);

        mQ = findViewById(R.id.qButton);
        mJewels = findViewById(R.id.abButton);
        mArtem = findViewById(R.id.arButton);
        mBlessed = findViewById(R.id.fButton);
        mJerry = findViewById(R.id.jButton);

        Button[] buttons = {mQ, mJewels, mArtem, mBlessed, mJerry};
        for(int i = 0; i < 5; i++)
            attachClickListener(buttons[i],i);
    }
}
