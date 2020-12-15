package com.example.mad_ha1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etchirps;
    TextView Result;
    Button button;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etchirps = findViewById(R.id.etchirps);
        button = findViewById(R.id.button);
        Result = findViewById(R.id.Result);

        Result.setVisibility(View.GONE);

        formatter = new DecimalFormat("#0.00");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etchirps.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter Chirps", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int chirps = Integer.parseInt(etchirps.getText().toString().trim());

                    double temp = (chirps/3.0)+4;

                    String results = "The approximate temperature outside is "+ formatter.format(temp)+" Degree Celcius.";

                    Result.setText(results);
                    Result.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    
}