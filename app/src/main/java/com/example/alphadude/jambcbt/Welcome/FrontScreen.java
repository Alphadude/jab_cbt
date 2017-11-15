package com.example.alphadude.jambcbt.Welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.alphadude.jambcbt.Activities.Home;
import com.example.alphadude.jambcbt.R;

public class FrontScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_screen);

        Button start = (Button)findViewById(R.id.startTest);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FrontScreen.this, Home.class));
            }
        });
    }
}
