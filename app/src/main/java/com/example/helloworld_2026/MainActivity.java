package com.example.helloworld_2026;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        TextView tekstas = findViewById(R.id.tekstas);
        Button mygtukas = findViewById(R.id.mygtukas);
        Button spalvosMygtukas = findViewById(R.id.spalvosMygtukas);

        mygtukas.setOnClickListener(v -> {
            tekstas.setText(R.string.labas);
        });

        spalvosMygtukas.setOnClickListener(v -> {
            tekstas.setTextColor(Color.GREEN);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}