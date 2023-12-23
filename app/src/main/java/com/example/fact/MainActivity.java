package com.example.fact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputNumber;
    Button calculateButton;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber =(EditText) findViewById(R.id.input_number);
        calculateButton=(Button) findViewById(R.id.calculate_button);
        resultText=(TextView) findViewById(R.id.result_text);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = inputNumber.getText().toString();
                if (!input.isEmpty()) {
                    int number = Integer.parseInt(input);
                    int factorial = fact(number);
                    resultText.setText("factorial of a number " + number + " is: " + factorial);
                } else {
                    resultText.setText("Please enter a number.");
                }
            }
        });
    }
    private int fact(int n) {
        if (n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
