package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // DECLARING VARIABLE FOR APP USAGE
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FINDING ELEMENT IN APP
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "THIS IS A TOAST", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                textView.setText("The corresponding value in pounds is: " + pound);
//                Toast.makeText(MainActivity.this, "Thanks for using this app :)", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    // SEPERATE METHOD FOR CONVERSION
    public void calculate(View view){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        textView.setText("The corresponding value in pounds is: " + pound);
        Toast.makeText(MainActivity.this, "Thanks for using this app :)", Toast.LENGTH_SHORT).show();
    }
}