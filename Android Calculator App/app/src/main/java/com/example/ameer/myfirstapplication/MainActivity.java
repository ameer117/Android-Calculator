package com.example.ameer.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonadd, buttonsub,
    buttondiv, buttonmult, buttonpercent, buttondecimal, buttonback, buttonac, buttonequal;

    EditText e;

    float x,y;

    boolean isAdd, isSub, isMult, isDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button17);
        button1 = (Button) findViewById(R.id.button13);
        button2 = (Button) findViewById(R.id.button14);
        button3 = (Button) findViewById(R.id.button15);
        button4 = (Button) findViewById(R.id.button9);
        button5 = (Button) findViewById(R.id.button10);
        button6 = (Button) findViewById(R.id.button11);
        button7 = (Button) findViewById(R.id.button5);
        button8 = (Button) findViewById(R.id.button6);
        button9 = (Button) findViewById(R.id.button7);
        buttonadd = (Button) findViewById(R.id.button12);
        buttonsub = (Button) findViewById(R.id.button16);
        buttondiv = (Button) findViewById(R.id.button4);
        buttonmult = (Button) findViewById(R.id.button8);
        buttonpercent = (Button) findViewById(R.id.button3);
        buttondecimal = (Button) findViewById(R.id.button18);
        buttonback = (Button) findViewById(R.id.button2);
        buttonac = (Button) findViewById(R.id.button1);
        buttonequal = (Button) findViewById(R.id.button19);

    button0.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            e.setText(e.getText() + "0");
        }
    });
    button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + "7");
            }
        });button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + "9");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                x = Float.parseFloat(e.getText() + "");
                isAdd = true;
                e.setText(null);
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                x = Float.parseFloat(e.getText() + "");
                isSub = true;
                e.setText(null);
            }
        });
        buttonmult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                x = Float.parseFloat(e.getText() + "");
                isMult = true;
                e.setText(null);
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                x = Float.parseFloat(e.getText() + "");
                isDiv = true;
                e.setText(null);
            }
        });
        buttonback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (e.getText() != null) {
                    String a = e.getText() + "";
                    e.setText(a.substring(0, a.length() - 1));
                }
            }
        });
        buttonpercent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                x = Float.parseFloat(e.getText() + "");
                e.setText(x/100.0 + "");
            }
        });
        buttondecimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText(e.getText() + ".");
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                y = Float.parseFloat(e.getText() + "");
                if (isAdd == true){
                    e.setText(x + y + "");
                    isAdd = false;
                }
                if (isSub == true){
                    e.setText(x - y + "");
                    isSub = false;
                }
                if (isMult == true){
                    e.setText(x * y + "");
                    isMult = false;
                }
                if (isDiv == true){
                    e.setText(x/y + "");
                    isDiv = false;
                }
            }
        });
        buttonac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e.setText("");
            }
        });


    }
}
