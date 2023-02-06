package com.example.scannerqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String myText = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, ScanActivity.class);
        Button startButton = findViewById(R.id.button);
        TextView textView = findViewById(R.id.viewTextId);

        Bundle parametros = this.getIntent().getExtras();
        if(parametros !=null){
            String datos = parametros.getString("text");
            textView.setText(datos);
        }

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }
}