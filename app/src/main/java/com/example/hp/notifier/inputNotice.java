package com.example.hp.notifier;


import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

import static android.R.id.edit;

public class inputNotice extends Activity {

    public String Title;
    public String Notice;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputnotice);


    }

     public void input(View view){
         EditText title = (EditText)findViewById(R.id.title);
         EditText notice = (EditText) findViewById(R.id.notice);
         Button submit = (Button) findViewById(R.id.submit);

          Title = (String) title.getText().toString();
           Notice = (String) notice.getText().toString();

         message msg = new message(Title,Notice);
        mDatabase = FirebaseDatabase.getInstance().getReference("Board");
         String id = mDatabase.push().getKey().toString();
         mDatabase.child(id).setValue(msg);
     }

}



