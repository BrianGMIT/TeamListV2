package com.example.brian.teamlist;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyList extends ListActivity {

    //String[] myTeam = {"Deirdre", "Ruth", "Colm", "Paul", "Brian", "Jem"};
    ArrayList<TeamMember> myTeam;

    TextView selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        myTeam = new ArrayList<TeamMember>();
        myTeam.add(new TeamMember("Colm", "Architect", R.drawable.colm));
        myTeam.add(new TeamMember("Ruth", "Developer", R.drawable.ruth));
        myTeam.add(new TeamMember("Jem", "Manager", R.drawable.jem));

        setListAdapter(new MyListAdapter(this, R.layout.row, myTeam));

        selected = (TextView)findViewById(R.id.selected);
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        String selection = l.getItemAtPosition(position).toString();
        Toast.makeText(this, selection, Toast.LENGTH_LONG).show();
        Log.d("position", Integer.toString(position));
        Log.d("id", Long.toString(id));
        selected.setText(selection);
    }
}
