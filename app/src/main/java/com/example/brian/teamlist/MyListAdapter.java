package com.example.brian.teamlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<TeamMember> {

    private int layoutResource;

    public MyListAdapter(Context context, int layoutResource, List<TeamMember> myTeam) {
        super(context, layoutResource, myTeam);
        this.layoutResource = layoutResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(layoutResource, null);
        }

        TeamMember individual = getItem(position);

        if (individual != null) {
            TextView tVName = (TextView) view.findViewById(R.id.name);
            TextView tVRole = (TextView) view.findViewById(R.id.role);
            ImageView iV1 = (ImageView) view.findViewById(R.id.icon);

            if (tVName != null) {
                tVName.setText(individual.getName());
            }
            if (tVRole != null) {
                tVRole.setText(individual.getRole());
            }
            if (iV1 != null) {
                iV1.setBackgroundResource(individual.getImgId());
                iV1.getLayoutParams().width = 200;
                iV1.getLayoutParams().height = 200;
            }
        }

        return view;
    }
}
