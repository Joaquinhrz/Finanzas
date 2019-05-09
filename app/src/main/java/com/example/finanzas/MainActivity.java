package com.example.finanzas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public
    Button btn;
    Button btn2;
    Button btn3;
    Button btn4;
    EditText txt;
    EditText txt2;
    EditText txt3;
    EditText txt4;
    TextView txtvw;
    TextView txtvw2;
    TextView txtvw3;
    TextView txtvw4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn=(Button)findViewById(R.id.button1);
        txtvw=(TextView)findViewById(R.id.textView1);
        txtvw.setMovementMethod(new ScrollingMovementMethod());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=(EditText)findViewById(R.id.EditText1);

                txtvw.setText("\n"+txt.getText().toString()+"\n");

            }
        });


        btn2=(Button)findViewById(R.id.button2);
        txtvw2=(TextView)findViewById(R.id.textView2);
        txtvw2.setMovementMethod(new ScrollingMovementMethod());

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2=(EditText)findViewById(R.id.EditText2);

                txtvw2.setText("\n"+txt2.getText().toString()+"\n");
            }
        });

        btn3=(Button)findViewById(R.id.button3);
        txtvw3=(TextView)findViewById(R.id.textView3);
        txtvw3.setMovementMethod(new ScrollingMovementMethod());

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt3=(EditText)findViewById(R.id.EditText3);

                txtvw3.setText("\n"+txt3.getText().toString()+"\n");
            }
        });

        btn4=(Button)findViewById(R.id.button4);
        txtvw4=(TextView)findViewById(R.id.textView4);
        txtvw4.setMovementMethod(new ScrollingMovementMethod());

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt4=(EditText)findViewById(R.id.EditText4);

                txtvw4.setText("\n"+txt4.getText().toString()+"\n");
            }
        });




    }

}



