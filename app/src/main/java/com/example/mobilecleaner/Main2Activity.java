package com.example.mobilecleaner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioButton1 = findViewById(R.id.rbAn);
        radioButton2 = findViewById(R.id.rbWeb);
        radioButton3 = findViewById(R.id.rbApi);
        radioButton4 = findViewById(R.id.rbIot);
        imageView = findViewById(R.id.ivShowimg);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
        radioButton4.setOnClickListener(this);




//        radioGroup = findViewById(R.id.rgSubject);
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                if (i == R.id.rbAn)
//                {
//                    Toast.makeText(Main2Activity.this, "Android", Toast.LENGTH_SHORT).show();
//                }
//
//                if (i == R.id.rbWeb)
//                {
//                    Toast.makeText(Main2Activity.this, "Website", Toast.LENGTH_SHORT).show();
//                }
//
//                if (i == R.id.rbApi)
//                {
//                    Toast.makeText(Main2Activity.this, "API", Toast.LENGTH_SHORT).show();
//                }
//
//                if (i == R.id.rbIot)
//                {
//                    Toast.makeText(Main2Activity.this, "IOT", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.rbAn :
                imageView.setImageResource(R.drawable.batman);
                break;
            case R.id.rbWeb :
                imageView.setImageResource(R.drawable.pic);
                break;
            case R.id.rbApi :
                imageView.setImageResource(R.drawable.queen);
                break;
            case R.id.rbIot :
                imageView.setImageResource(R.drawable.b1);
                break;


        }
    }
}
