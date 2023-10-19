package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String operand;
    double value1,value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickNumericalButton(View view){
        TextView display=findViewById(R.id.resultEdit);
        Button b=(Button) view;
        if(display.getText().toString().equals(operand)){
            display.setText(b.getText().toString());
        }
        else{
            display.setText(display.getText()+b.getText().toString());}
    }
    public void onClickFunctionButton(View view){
        EditText display= findViewById(R.id.resultEdit);
        value1= Double.parseDouble(display.getText().toString());
        Button b= (Button) view;
        display.setText(b.getText());
        operand= (String) ((Button) view).getText();


    }
    public void onClickResult(View view){
        EditText e=findViewById(R.id.resultEdit);
        value2=Double.parseDouble(e.getText().toString());
        double result=0;
        switch (operand){
            case "+":
                result= value1+value2;
                break;
            case "-":
                result= value1-value2;
                break;
            case "/":
                result=value1/value2;
                break;
            case "X":
                result=value1*value2;
                break;
        }
        e.setText(String.valueOf(result));
    }

    public void onClickClear(View view){
        TextView display= findViewById(R.id.resultEdit);
        display.setText("");
    }
}
