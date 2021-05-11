package com.example.exe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText txttemperatura;
    TextView txtresultado;

    public void converter(View view){
        txttemperatura = findViewById(R.id.txttemperatura);
        txtresultado = findViewById(R.id.txtresultado);

        double v = Double.parseDouble(txttemperatura.getText().toString());

        double f = ((v * 1.8) + 32);

        txtresultado.setText( "O valor em fahrenheit é: " +String.valueOf(f));




    }
}