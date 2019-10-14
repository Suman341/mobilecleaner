package com.example.mobilecleaner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity implements View.OnClickListener  {

    EditText editText;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnadd, btnsub, btnmulti,btndiv, btnequal, btncls;
    String displayNum = "";
    int num1,num2;
    int res;
    String op, jg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editText = findViewById(R.id.rslt);
        btn0 = findViewById(R.id.btn0);
        btn1 =findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnadd = findViewById(R.id.btnAdd);
        btnsub = findViewById(R.id.btnSub);
        btndiv = findViewById(R.id.btnDiv);
        btnequal = findViewById(R.id.btnEqual);
        btnmulti = findViewById(R.id.btnMulti);
        btncls = findViewById(R.id.btnCls);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnequal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn1:
                displayNum += 1;
                editText.setText(displayNum);
                break;

            case R.id.btn2:
                displayNum += 2;
                editText.setText(displayNum);
                break;

            case R.id.btnAdd:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "+";
                break;

            case R.id.btnEqual:
                num2 = Integer.parseInt(displayNum);
                res = getResult(op,num1,num2);
                editText.setText(String.valueOf(res));
                break;
        }
    }

    private int getResult(String op,int n1, int n2)
    {
        switch(op)
        {
            case "+":
              return n1+n2;

            case "-":
                return n1-n2;

            case "*":
                return n1*n2;

            case "/":
                return n1/n2;

              default:
                  return 0;
        }
    }
}
