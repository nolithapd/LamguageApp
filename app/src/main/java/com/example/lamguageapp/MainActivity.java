package com.example.lamguageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     TextView textDisplay;
     Button btnContinue;
     String selectedLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textDisplay=(TextView)findViewById(R.id.txtDisplay);
        btnContinue=(Button)findViewById(R.id.btnCont);

        textDisplay.setVisibility(View.GONE);
        btnContinue.setVisibility(View.GONE);

        btnContinue.setOnClickListener(MainActivity.this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.overflow_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.englishOptiom:
                selectedLanguage="English";
                textDisplay.setVisibility(View.VISIBLE);
                btnContinue.setVisibility(View.VISIBLE);
                textDisplay.setText("Click button to continue");
                btnContinue.setText("Button");
                break;
            case R.id.afrikaansOption:
                selectedLanguage="Afrikaans";
                textDisplay.setVisibility(View.VISIBLE);
                btnContinue.setVisibility(View.VISIBLE);
                textDisplay.setText("Klik knoppie om Voort te gaan");
                btnContinue.setText("Knoppie");
                btnContinue.setOnClickListener(MainActivity.this);
                break;

            case R.id.zuluOption:
                selectedLanguage="Zulu";
                textDisplay.setVisibility(View.VISIBLE);
                btnContinue.setVisibility(View.VISIBLE);
                textDisplay.setText("Chofoza inkinobho ukuze uqhubeke");
                btnContinue.setText("Inkinobho");
                btnContinue.setOnClickListener(MainActivity.this);
                break;

            default:
                return super.onOptionsItemSelected(item);

        }
        return true;

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SecondInterface.class);
        intent.putExtra("extra", selectedLanguage);
        startActivity(intent);
    }
}