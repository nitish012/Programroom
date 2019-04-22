package com.example.programroom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Deleteuserfragment extends Fragment {

    EditText deletionid;
    Button btndelete;


    public Deleteuserfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_deleteuserfragment, container, false);
       deletionid=view.findViewById(R.id.deletionid);
       btndelete=view.findViewById(R.id.btndelete);

       btndelete.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               int id=Integer.parseInt(deletionid.getText().toString());
               User user=new User();
               user.setId(id);
               MainActivity.myDatabase.mydao().deleteuser(user);

               Toast.makeText(getActivity(), "Deleted successfully", Toast.LENGTH_SHORT).show();
               deletionid.setText("");
           }
       });


       return view;
    }

}
