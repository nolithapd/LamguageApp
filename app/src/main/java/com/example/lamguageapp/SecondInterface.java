package com.example.lamguageapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondInterface  extends AppCompatActivity {

    TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_interface);

        welcomeText=(TextView)findViewById(R.id.txtWelcome);
        String displayText = getIntent().getStringExtra("extra");
        
        switch(displayText){
            case "English":
                welcomeText.setText("Welcome to page 2");
                break;
            case "Afrikaans":
                welcomeText.setText("Welkom op bladsy 2");
                break;
            case "Zulu":
                welcomeText.setText("Wamukelekile ekhasini lesi-2");
                break;
            default:
                welcomeText.setText("");
        }
    }

}
