package com.example.programroom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Updateuser extends Fragment {

Button btnupdate;
EditText updationid,updationemail,updationname;
    public Updateuser() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_updateuser, container, false);
        updationid=view.findViewById(R.id.updationid);
        updationemail=view.findViewById(R.id.updationemail);
        updationname=view.findViewById(R.id.updationname);
        btnupdate=view.findViewById(R.id.btnupdate);

        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int id=Integer.parseInt(updationid.getText().toString());
                String name=updationname.getText().toString();
                String email=updationemail.getText().toString();

                User user=new User();

                user.setId(id);
                user.setEmail(email);
                user.setName(name);

                MainActivity.myDatabase.mydao().updateuser(user);
                Toast.makeText(getActivity(), "updated successfully", Toast.LENGTH_SHORT).show();

                updationid.setText("");
                updationemail.setText("");
                updationname.setText("");
            }
        });


        return view;
    }

}
