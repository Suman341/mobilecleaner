package com.example.mobilecleaner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText firstNum, secondNum;
    TextView textViewResult;
    Button btnadd, btnsub, btnmulti, btndiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        textViewResult= findViewById(R.id.tvResult);
        btnadd = findViewById(R.id.btnAdd);
        btnsub = findViewById(R.id.btnSub);
        btnmulti = findViewById(R.id.btnMulti);
        btndiv = findViewById(R.id.btnDiv);

        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        //event listener for button click

//        btnadd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int a = Integer.parseInt(firstNum.getText().toString());
//                int b = Integer.parseInt(secondNum.getText().toString());
//                int c = a+b;
//                textViewResult.setText("Result:   "+ String.valueOf(c));
//            }
//        });
//
//        btnsub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int a = Integer.parseInt(firstNum.getText().toString());
//                int b = Integer.parseInt(secondNum.getText().toString());
//                int c = a-b;
//                textViewResult.setText(String.valueOf(c));
//            }
//        });
//
//
//        btnmulti.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int a = Integer.parseInt(firstNum.getText().toString());
//                int b = Integer.parseInt(secondNum.getText().toString());
//                int c = a*b;
//                textViewResult.setText(String.valueOf(c));
//            }
//        });
//
//        btndiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int a = Integer.parseInt(firstNum.getText().toString());
//                int b = Integer.parseInt(secondNum.getText().toString());
//                int c = a/b;
//                textViewResult.setText(String.valueOf(c));
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnAdd)
        {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            int c = a+b;
            textViewResult.setText("Result:   "+ String.valueOf(c));
        }

        if (view.getId() == R.id.btnSub)
        {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            int c = a-b;
            textViewResult.setText("Result:   "+ String.valueOf(c));
        }

        if (view.getId() == R.id.btnMulti)
        {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            int c = a*b;
            textViewResult.setText("Result:   "+ String.valueOf(c));
        }


        if (view.getId() == R.id.btnDiv)
        {
            int a = Integer.parseInt(firstNum.getText().toString());
            int b = Integer.parseInt(secondNum.getText().toString());
            int c = a/b;
            textViewResult.setText("Result:   "+ String.valueOf(c));
        }


    }
}
