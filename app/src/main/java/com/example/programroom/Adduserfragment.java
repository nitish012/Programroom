package com.example.programroom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Adduserfragment extends Fragment {

EditText Username,Useremail,Userid;
Button btnsave;

    public Adduserfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_adduserfragment, container, false);

        Username=view.findViewById(R.id.user_name);
        Useremail=view.findViewById(R.id.user_email);
        Userid=view.findViewById(R.id.user_id);
        btnsave=view.findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int userid=Integer.parseInt(Userid.getText().toString());
                String useremail=Useremail.getText().toString();
                String username=Username.getText().toString();

                User user=new User();
                user.setName(username);
                user.setEmail(useremail);
                user.setId(userid);

                MainActivity.myDatabase.mydao().adduser(user);
                Toast.makeText(getActivity(), "user added successfully", Toast.LENGTH_SHORT).show();

                Userid.setText(null);
                Useremail.setText(null);
                Username.setText(null);

            }
        });


        return view;

    }

}
