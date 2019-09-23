package com.example.mymovie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    Button button;
    String getMovieName,getActor,getActress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.mn);
        ed2=(EditText)findViewById(R.id.actor);
        ed3=(EditText)findViewById(R.id.actrs);
        button=(Button)findViewById(R.id.but);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // Toast.makeText(getApplicationContext(),"Test",Toast.LENGTH_LONG).show();

           getMovieName=ed1.getText().toString();
           getActor=ed2.getText().toString();
           getActress=ed3.getText().toString();
           Toast.makeText(getApplicationContext(),getMovieName,Toast.LENGTH_SHORT).show();
           Toast.makeText(getApplicationContext(),getActor,Toast.LENGTH_SHORT).show();


            }
        });




    }
}
