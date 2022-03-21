package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sum(View v)
    {

        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        TextView result=findViewById(R.id.result);

        String n1,n2;
        double a,b;
        n1=e1.getText().toString();
        n2=e2.getText().toString();
        a=Double.parseDouble(n1);
        b=Double.parseDouble(n2);
        String res=String.valueOf(a+b);
        result.setText(res);


    }
    public void sub(View v)
    {

        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        TextView result=findViewById(R.id.result);

        String n1,n2;
        double a,b;
        n1=e1.getText().toString();
        n2=e2.getText().toString();
        a=Integer.parseInt(n1);
        b=Integer.parseInt(n2);
        String res=String.valueOf(a-b);
        result.setText(res);


    }    public void mul(View v)
    {

        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        TextView result=findViewById(R.id.result);

        String n1,n2;
        double a,b;
        n1=e1.getText().toString();
        n2=e2.getText().toString();
        a=Integer.parseInt(n1);
        b=Integer.parseInt(n2);
        String res=String.valueOf(a*b);
        result.setText(res);


    }    public void div(View v)
    {

        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        TextView result=findViewById(R.id.result);

        String n1,n2;
        double a,b;
        n1=e1.getText().toString();
        n2=e2.getText().toString();
        a=Integer.parseInt(n1);
        b=Integer.parseInt(n2);
        String res=String.valueOf(a/b);
        result.setText(res);


    }
}