package com.example.baitaplab11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    TextView textViewResult;
    Button buttonAdd,buttonSub,buttonMul,buttonDiv,buttonPercent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editText1= findViewById(R.id.editTextText1);
        editText2= findViewById(R.id.editTextText2);
        textViewResult= findViewById(R.id.textViewResult);
        buttonAdd=findViewById(R.id.buttonAdd);
        buttonSub=findViewById(R.id.buttonSub);
        buttonMul=findViewById(R.id.buttonMul);
        buttonDiv=findViewById(R.id.buttonDiv);
        buttonPercent=findViewById(R.id.buttonPercent);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result= Double.parseDouble(editText1.getText().toString())+Double.parseDouble(editText2.getText().toString());
                textViewResult.setText(Double.toString(result));
                editText1.setText("");
                editText2.setText("");
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result= Double.parseDouble(editText1.getText().toString())-Double.parseDouble(editText2.getText().toString());
                textViewResult.setText(Double.toString(result));
                editText1.setText("");
                editText2.setText("");
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result= Double.parseDouble(editText1.getText().toString())*Double.parseDouble(editText2.getText().toString());
                textViewResult.setText(Double.toString(result));
                editText1.setText("");
                editText2.setText("");
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result= Double.parseDouble(editText1.getText().toString())/Double.parseDouble(editText2.getText().toString());
                textViewResult.setText(Double.toString(result));
                editText1.setText("");
                editText2.setText("");
            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result= Double.parseDouble(editText1.getText().toString())%Double.parseDouble(editText2.getText().toString());
                textViewResult.setText(Double.toString(result));
                editText1.setText("");
                editText2.setText("");
            }
        });



    }
}