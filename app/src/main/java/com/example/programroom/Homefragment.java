package com.example.programroom;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Homefragment extends Fragment implements View.OnClickListener {

    private Button adduser,viewuser,deleteuser,updateuser;

    public Homefragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_homefragment, container, false);
        adduser=view.findViewById(R.id.adduser);
        adduser.setOnClickListener(this);

        viewuser=view.findViewById(R.id.viewuser);
        viewuser.setOnClickListener(this);

        deleteuser=view.findViewById(R.id.deleteuser);
        deleteuser.setOnClickListener(this);

        updateuser=view.findViewById(R.id.updateuser);
        updateuser.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.adduser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentcontainer,new Adduserfragment()).addToBackStack(null).commit();
                break;


            case R.id.viewuser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentcontainer,new Readuserfragment()).addToBackStack(null).commit();
                break;

            case R.id.deleteuser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentcontainer,new Deleteuserfragment()).addToBackStack(null).commit();
                break;

            case R.id.updateuser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentcontainer,new Updateuser()).addToBackStack(null).commit();
                break;

        }
    }
}
