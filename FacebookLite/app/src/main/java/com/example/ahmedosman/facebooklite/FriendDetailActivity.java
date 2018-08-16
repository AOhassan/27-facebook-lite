package com.example.ahmedosman.facebooklite;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FriendDetailActivity extends AppCompatActivity{

    private TextView mName;
    private TextView mBio;
    private Button mBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_detail_activity);

        Intent data = getIntent();
        data.getStringExtra("name");
        data.getStringExtra("bio");

        mName = findViewById(R.id.name);
        mBio = findViewById(R.id.bio);
        mBack = findViewById(R.id.back);

        mName.setText(data.getStringExtra("name"));
        mBio.setText(data.getStringExtra("bio"));


        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
