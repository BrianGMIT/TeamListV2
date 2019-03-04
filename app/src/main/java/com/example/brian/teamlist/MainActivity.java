package com.example.brian.teamlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is a comments
    }

    public void listTeam(View view){
        Intent it = new Intent(this, MyList.class);
        startActivity(it);
    }
}
